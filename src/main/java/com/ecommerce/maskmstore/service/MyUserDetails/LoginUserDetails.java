package com.ecommerce.maskmstore.service.MyUserDetails;

import com.ecommerce.maskmstore.model.Role;
import com.ecommerce.maskmstore.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class LoginUserDetails implements UserDetails {
    private String username;
    private String password;
    private Set<Role> roles;


    public LoginUserDetails(User user){

        username = user.getUsername();
        password = user.getPassword();
        roles = user.getRoles();

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //ROLE_+
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public String getRoles() {

        System.out.println("Role");
        System.out.println(roles.stream().map(role -> role.getRole()).collect(Collectors.toList()));
        return roles.stream().map(role -> role.getRole()).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
