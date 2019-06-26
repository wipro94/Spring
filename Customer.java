package com.example.entities;
import java.util.List;
public class Customer
{
  private String id;
  private String name;
  private String description;
  private List<Product> products;
  public Customer(String id, String name,String description,List<Product> products)
  {
    super();
    this.id=id;
    this.name=name;
    this.description=description;
    this.products=products;
   }
   
