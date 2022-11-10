import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        int mesafe, yas, tip;
        Scanner scanner = new Scanner(System.in);
        System.out.print("gideceğiniz mesafeyi km cinsinden giriniz");
        mesafe = scanner.nextInt();
        System.out.print("yaşınızı giriniz");
        yas = scanner.nextInt();
        System.out.println("bilet tipi 1=gidiş 2=gidiş dönüş");
        tip = scanner.nextInt();
        double NormalTutar=0.0;
        double YasIndirim=0.0;
        double CiftYonIndirim=0.0;
      if (yas>0&&mesafe>0){

        if(yas<12){
            YasIndirim=(mesafe*0.10)*0.50;
        }
        if(yas>=12&&yas<24){
            YasIndirim=(mesafe*0.10)*0.10;
        }
        if(yas>65){
            YasIndirim=(mesafe*0.10)*0.30;
        }
        if (tip==1){
            NormalTutar=mesafe*0.10;

        }
        if (tip==2){
            NormalTutar=(mesafe*0.10)*2;
            CiftYonIndirim=(mesafe*0.10)*0.20;
        }
          System.out.println("normal tutar="+NormalTutar);
        System.out.println("yas indirim ="+YasIndirim);
          System.out.println("cift yon indirim ="+CiftYonIndirim);
          System.out.println("indirimli bilet fiyarınız ="+(NormalTutar-YasIndirim-CiftYonIndirim));



        }
      else{
          System.out.println("yanlış bir değer girdiniz");
      }
   }
}