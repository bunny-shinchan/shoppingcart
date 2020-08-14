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
public class ShoppingCartDemo {
    public static void main (String [] args){
            PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
            PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
            PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
             
            Cart cart = new Cart();
            cart.addproduct(new Product ("shirt",50));
            cart.addproduct(new Product ("pants",60));
            
            cart.setPaymentService(creditService);
            cart.payCart();
            
            cart.setPaymentService(debitService);
            cart.payCart();
            
    }
}
