public class AgeException extends Exception{

    AgeException(String message){
        super(message);
    }

    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("\nYou must be 18 or older to sign up!");
        }
        else{
            System.out.println("You are now signed up!");
        }
    }
}


// ADD TO THE MAIN CLASS (customer exception to check if user is >18)
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scan.nextInt();
//
//        try{
//            checkAge(age);
//        }
//        catch (Exception e){
//            System.out.println("A problem occured: " + e);
//        }
//
//    }
//
//    static void checkAge(int age) throws AgeException{
//        if(age<18){
//            throw new AgeException("\nYou must be 18 or older to sign up!");
//        }
//        else{
//            System.out.println("You are now signed up!");
//        }
//    }
//
//}