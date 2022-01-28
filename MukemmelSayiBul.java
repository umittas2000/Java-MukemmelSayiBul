import java.util.Scanner;

public class MukemmelSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplamlar=0;

        System.out.print("Bir sayi giriniz: ");
        sayi=input.nextInt();

        if(sayi>0) {
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplamlar += i;
                }
            }
        }else{
            System.out.println("Lutfen pozitif sayi girin.");
        }
        if(toplamlar == sayi){
            System.out.println(sayi+ " bir Mukemmel sayidir!");
        }
        else{
            System.out.println(sayi+ " bir Mukemmel sayi degildir...");
        }
    }
}
