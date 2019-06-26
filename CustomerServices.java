import java.mathbiginteger;
public class Customerservice 
{
  private static list<Customer> customers = new ArrayList<>();
  static
  {
    Product product1 = new Product("Product_A","Slip_Ons","Rubber water proof sole and a super cute design");
    Product product2 = new Product("Product_B","Sneakers","Armed with a rubber sole and easy towipe and clean denim fabric");
    Product product3 = new Prouct("Product_C","Loafers","Meutral ten base and colourful embriodary loafers");
    Product product4 = new Product("Product_D","Brogues","A classic combination of dreamy lace and leather for the effortless pretty look");
    Product product4 = new Product("Product_E","Juttis","Prettiest juttis with hand embriodary with mirror and sequin world");
    
    Customer Payal = new Customer("Customer1","Payal Sharma","Hiker and Architect",new ArrayList<>(Arrays.asList(product1,product2,product3,product4)));
    Customer Neha = new Customer("Customer2","Neha Singhania","Programmer and Designer",new ArrayList<>(Arrays.asList(product1,product2,product3,product4)));
    customers.add(Payal);
    customers.add(Neha);
    
   }
   public List<Customer> retrieveAllCustomers()
   {
     return customers;
   }
   public Customer retrieveCustomer(String customerId)
   {
     for(Customer customer:customers)
     {
       if(customer.getId()equals(customerId))
       {
         return customer;
       }
     }
     return null;
   }
   
   public List<Product> retrieveProducts(StringCustomerId)
   { 
     Customer customer= retrieveCustomer(customerId);
     if(customer==null)
     {
       return null;
     }
     
     return customer.getPrducts();
   }
   
   public Product retrieveProduct(String customerId,String productId)
   {
     Customer customer = retrieveCustomer(cudtomerId);
     if(customer==null)
     {
        return null;
     }
     
     for(Product product:customer.getProducts())
     {
       if(product.getId().equals(productId))
       {
          return product;
       }
     }
    }
