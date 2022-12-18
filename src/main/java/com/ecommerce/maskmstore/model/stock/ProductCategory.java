package com.ecommerce.maskmstore.model.stock;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable
	@JsonIgnore
	private List<Product> products;

}
