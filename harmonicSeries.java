import java.util.Scanner;

public class harmonicSeries{

public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);

    System.out.println("Bir Sayı giriniz") ;

    double num = inp.nextDouble();

    double ans = 0 ;

    for(double i = 1 ; i <= num ; i++ ){

        ans += (1 / i);
    }
    System.out.println(num+" sayısının harmonik serisi = "+ans);
}
}