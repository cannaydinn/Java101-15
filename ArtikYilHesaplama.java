import java.util.Scanner;

public class ArtikYilHesaplama{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = sc.nextInt();

        if(yil % 400 == 0){
            System.out.print(yil+" bir artık yıldır !");
        }
        else{
            System.out.print(yil+" bir artık yıl değildir !");
        }
    }
}