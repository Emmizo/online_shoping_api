package com.ecommerce.ecommerce_backend.modal;

import lombok.Data;

import java.util.List;

@Data
public class Home {
private List<HomeCategory> grid;
private List<HomeCategory> shopByCategories;
private List<HomeCategory> electricCategory;
private List<HomeCategory> dealCategory;
private List<Deal> deals;
}
