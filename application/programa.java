package application;
import java.util.Scanner;

public class programa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos números vão ser digitados:");
        int n = sc.nextInt();

        int[] vet= new int[n];

        for(int i=0;i<vet.length;i++){
            System.out.print("Informe um número:");
            vet[i]=sc.nextInt();
        }

        for(int i=0;i<vet.length;i++){
            if (vet[i]<0) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}