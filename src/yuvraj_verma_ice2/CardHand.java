/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuvraj_verma_ice2;

/**
 *
 * @author yuvraj verma
 */
public class CardHand {
    //cohesiion : only creates ann array of the cards
    //reuse: we can use this class by changing the values of array size and the genre of cards
      private int size= 60;// 15 cards of 4 colors
    public CardModel[] deck = new CardModel[size];
    //created an array to store the values
    public void generate()
    {
        int counter ;
        counter = 0;
        //nested for loops to create the (color, value) array
        for (CardModel.Colors color:CardModel.Colors.values())
        {
            for (CardModel.Value value:CardModel.Value.values())
            {
                CardModel c1= new CardModel(color,value);
                deck[counter]= c1;//(new CardModel(s,v));
                counter++;
            }
        }
    }
    
}
    

