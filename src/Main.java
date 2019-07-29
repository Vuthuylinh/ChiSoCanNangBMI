import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your height in meter: ");
        float height=input.nextFloat();
        System.out.print("Enter your weight in kilogram: ");
        float weight = input.nextFloat();
        bmiIndex(height,weight);
    }
    public static void bmiIndex(float height, float weight){
        float bmi=weight/(height*height);
        if(bmi<18.5){
            System.out.println(" You are under weight!");
        }else if(bmi>18.5 && bmi<25){
            System.out.println(" You are normal ");
        }else if(bmi>25 && bmi<30){
            System.out.println(" You are overweight ");
        }else {
            System.out.println("You are obese");
        }
    }
}
