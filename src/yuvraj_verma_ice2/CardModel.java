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
public class CardModel {
    //to reuse: change the card genre and the values.
    //cohesion: this class only creates the values of the cards
    //to eliminate the string complication, using the enumerations
    public enum Colors {RED,YELLOW,GREEN,BLUE};
    public enum Value {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR};
     private final Colors color;//encapsulation
      private final Value value;
    
      public CardModel(Colors color, Value value){
        this.color = color;
        this.value = value;
    }

    /**
     * @return the color
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
   
    
 }

