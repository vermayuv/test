/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuvraj_verma_ice2;

/**
 *
 * @author yuvra
 */
public class Yuvraj_Verma_Ice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardHand ch = new CardHand();// declared the obje of Class to inovoke the method GENERATE : DELEGATION
        ch.generate();
        for(CardModel d:ch.deck)
        {
            System.out.println(d.getColor()+" "+d.getValue());//if we simple write, it will print only address
        }
    }
    
}
