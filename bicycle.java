import java.util.*;
import java.io.*;
class Disney{
        String define_me(){
                return "is Nobita.";
        }
}
class Cartoon extends Disney{
        String define_me(){
                return "have a lot of friends.";
        }

        Cartoon(){
                System.out.println("Hello I am Doraemon, I am "+ define_me());

                String temp=super.define_me();

                System.out.println("One of My Best Friend "+ temp );
        }

}
class Solution1{
        public static void main(String []args){
                Cartoon C=new Cartoon();
        }
}
