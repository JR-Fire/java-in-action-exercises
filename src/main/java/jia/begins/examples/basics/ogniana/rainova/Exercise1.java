package jia.begins.examples.basics.ogniana.rainova;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jr-fire
 * Date: Nov 6, 2010
 * Time: 12:43:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1 {

 public static void main(String[] args){
   boolean a = false;

     if(!a) {
         System.out.println(a);
     }
     System.out.printf("Hello, %s! It is %tD now.", "Oggie", new Date());
 }

}
