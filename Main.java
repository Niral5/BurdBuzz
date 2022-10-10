import java.util.Scanner;

class BurdBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = number.nextInt();

        Scanner first_multiple = new Scanner(System.in);
        System.out.print("Enter the first multiple:");
        int a = first_multiple.nextInt();

        Scanner second_multiple = new Scanner(System.in);
        System.out.print("Enter the second multiple:");
        int b = second_multiple.nextInt();



        for (int i = 1; i <= n; i++){

            if (i%(a*b)==0) {
                //multiple of a*b (a and b)
                System.out.println("BurdBuzz");
            }
            else if (i%a==0){
                //multiple of a
                System.out.println("Burd ");
            }
            else if (i%b==0){
                //multiple of b
                System.out.println("Buzz ");
            }
            else{
                System.out.println(i);
            }
        }

    }
}  