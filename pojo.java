/*
  * Pojo class
  *
  * Login
  *
  * PANCard
 */

package pojo;
import java.util.Scanner;
public class Pojo {
    Scanner Scanner = new Scanner(System.in);
    int Password1 = Scanner.nextInt();
    private int age;
    private static boolean isFemale;
    private final int Password = 1234;
    public Pojo(int age, boolean isFemale) {
        this.age = age;
        this.isFemale = isFemale;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isFemale() {
        return isFemale;
    }
    public void setFemale(boolean female) {
        isFemale = female;
    }
public void PanCard(){
        if(age > 18){
            System.out.println("You are eligible for apply a PAN card");
        }else{
            System.out.println("You are not eligible for apply a PAN card");
        }
}
public void Login(){
        if(Password1 == Password){
            System.out.println("Login Sucessfully");
        }
        else{
            System.out.println("Not Found");
        }
}

    public static void main(String[] args){
        Pojo p = new Pojo(21, isFemale);
        p.PanCard();
        p.Login();
        p.isFemale();
    }
}
