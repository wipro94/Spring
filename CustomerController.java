package com.example.controller;
import java.net.URI;

public class CustomerController
{
  private CustomerService cusomerService;
  public List<Product> retrieveProductForCustomer(String CustomerId)
  {
    return CustomerService.retrieveProducts(customerId);
  }
  
  public Product retrieveDetailsForProduct(String customerId,String productId)
  {
    return customerService.retrieveProduct(CustomerId,productId);
  }
  
  public ResponseEntity<void> registerCustomerForProduct(String CustomerId,Product new Product)
  {
    Product product = customerService.addProduct(CustomerId,new Product);
    if(product==null)
     return ResponseEntity.noContent().build();
     
   URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buidAndExpand(product.getId().toUri();
   
   return ResponseEntity.created(location).build();
   
  }
 }
