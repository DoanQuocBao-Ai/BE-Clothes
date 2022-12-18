package com.ecommerce.maskmstore.dto;

//import edu.miu.waa.maskmstore.domain.Image;
import com.ecommerce.maskmstore.model.Seller;
import com.ecommerce.maskmstore.model.stock.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ProductDTO {

    private boolean featured=false;

    private String title;

    private String description;

//    private List<Image> images;

    private double rating;
    private String status;
    private double price;
    private LocalDate createdOn;
    private ProductCategory productCategory;
    private Seller seller;


}
