/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author verms
 */
import java.util.ArrayList;

/**
 *
 * @author verms
 */
public class Cart {
    private ArrayList<Product> products = new ArrayList<>();
    private PaymentService service;
   private int CartSize;
    public void setPaymentService( PaymentService service){
    this.service = service;
    }
    public void addproduct(Product product){
        products.add(product);
    }
    
    public void payCart(){
        double totalCart =0;
        for( Product product : products){
        totalCart += product.getPrice();
        }
    service.processPayment(totalCart);
    }

    public int getCartSize() {
        return CartSize;
    }
    
}
