import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void bark(){
		System.out.println("dog is barking");
	}
}
class Dog extends Animal{
	void bow(){
		System.out.println("Bow Bow");
	}
    void lol(){
        System.out.println("lol lol");
    }
}
public class Solution{

   public static void main(String args[]){

	  Dog d = new Dog();
	  d.bark();
	  d.bow();
          d.lol();
	
   }
}