import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean yeniTanisma=false;
        boolean pozisyon=false;
        boolean tanismaEskilgi=false;
        boolean hata = false;
        boolean cikarcilik= false;
        boolean hataBaskasi=false;
        boolean olumluDusunce=false;

        int guvenPuanı=0;

        int a=1;

        int b=1;

        int c=1;

        int d=1;

        int e=1;

        int f=1;

        int g=1;





        Scanner klavye = new Scanner(System.in);

        System.out.println("Güven Analizi Programımıza hoş geldiniz");
        System.out.println("********");
        System.out.println("Bu programı birini işe alırkan veya hayatınızda " + "önemli bir yere koyucakken ya da bir ortaklık kuracakken kullanabilirsiniz. ");

        System.out.println("*********");
        System.out.println("program başlatılıyor.... ");

        for (int i = 0; i <a; i++) {
            System.out.println("Soru 1: Bu kişiyle yeni mi tanıştınız?   (cevabı evet veya hayır formatında giriniz)");
            String soru1cevap= klavye.next();
            if (soru1cevap.equals("evet") || soru1cevap.equals("Evet") || soru1cevap.equals("EVET")) {

                yeniTanisma=true;

            } else if (soru1cevap.equals("hayır") || soru1cevap.equals("Hayır") || soru1cevap.equals("Hayır")) {
                yeniTanisma=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                a++;
            }
        }
        for (int i = 0; i <b; i++) {
            System.out.println("Soru 2: Bu kişi sizin için önemli bir pozisyona mı geçicek?   (cevabı evet veya hayır formatında giriniz)");
            String soru2cevap= klavye.next();
            if (soru2cevap.equals("evet") || soru2cevap.equals("Evet") || soru2cevap.equals("EVET")) {

                pozisyon=true;

            } else if (soru2cevap.equals("hayır") || soru2cevap.equals("Hayır") || soru2cevap.equals("HAYIR")) {
                pozisyon=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                b++;
            }
        }
        for (int i = 0; i <c; i++) {
            System.out.println("Soru 3: Bu kişiyi 5 yıldan fazladır iyi anlamda tanıyor musun?   (cevabı evet veya hayır formatında giriniz)");
            String soru3cevap= klavye.next();
            if (soru3cevap.equals("evet") || soru3cevap.equals("Evet") || soru3cevap.equals("EVET")) {

                tanismaEskilgi=true;

            } else if (soru3cevap.equals("hayır") || soru3cevap.equals("Hayır") || soru3cevap.equals("Hayır")) {
                tanismaEskilgi=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                c++;
            }
        }
        for (int i = 0; i <d; i++) {
            System.out.println("Soru 4: Bu kişinin size karşı yaptığı bir yanlış oldu mu?   (cevabı evet veya hayır formatında giriniz)");
            String soru4cevap= klavye.next();
            if (soru4cevap.equals("evet") || soru4cevap.equals("Evet") || soru4cevap.equals("EVET")) {

                hata=true;

            } else if (soru4cevap.equals("hayır") || soru4cevap.equals("Hayır") || soru4cevap.equals("Hayır")) {
                hata=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                d++;
            }
        }
        for (int i = 0; i <e; i++) {
            System.out.println("Soru 5: Bu kişi çıkarcı bir insan mıdır?   (cevabı evet veya hayır formatında giriniz)");
            String soru5cevap= klavye.next();
            if (soru5cevap.equals("evet") || soru5cevap.equals("Evet") || soru5cevap.equals("EVET")) {

                cikarcilik=true;

            } else if (soru5cevap.equals("hayır") || soru5cevap.equals("Hayır") || soru5cevap.equals("Hayır")) {
                cikarcilik=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                e++;
            }
        }
        for (int i = 0; i <f; i++) {
            System.out.println("Soru 6: Bu kişinin başka birisine bir yanlışı olduğunu gördünüz mü?   (cevabı evet veya hayır formatında giriniz)");
            String soru6cevap= klavye.next();
            if (soru6cevap.equals("evet") || soru6cevap.equals("Evet") || soru6cevap.equals("EVET")) {

                hataBaskasi=true;

            } else if (soru6cevap.equals("hayır") || soru6cevap.equals("Hayır") || soru6cevap.equals("Hayır")) {
                hataBaskasi=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                f++;
            }
        }
        for (int i = 0; i <g; i++) {
            System.out.println("Soru 7: Bu kişi hakkında olumlu düşünceleriniz olumsuz düşüncelerden falza mı?   (cevabı evet veya hayır formatında giriniz)");
            String soru7cevap= klavye.next();
            if (soru7cevap.equals("evet") || soru7cevap.equals("Evet") || soru7cevap.equals("EVET")) {

                olumluDusunce=true;

            } else if (soru7cevap.equals("hayır") || soru7cevap.equals("Hayır") || soru7cevap.equals("Hayır")) {
                olumluDusunce=false;
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                g++;
            }
        }
        if (yeniTanisma==false) guvenPuanı=guvenPuanı+20;
        if (pozisyon==true) guvenPuanı=guvenPuanı+10;
        if (tanismaEskilgi==true) guvenPuanı=guvenPuanı+30;
        if (hata==true) guvenPuanı=guvenPuanı-30;
        if (cikarcilik==true) guvenPuanı=guvenPuanı-30;
        if (hataBaskasi==true) guvenPuanı=guvenPuanı-10;
        if (olumluDusunce==true) guvenPuanı=guvenPuanı+30;


        if (guvenPuanı==90){
            System.out.println("Bu kişye kessinlikle güvenebilirsin");
        }
        if (89<guvenPuanı&&guvenPuanı<90) System.out.println("bu kişi güvenilir");
        if (50<guvenPuanı&&guvenPuanı<89) System.out.println("dikkatli olmalısınız ama yine de güvenilir denebilir");
        if (20<guvenPuanı&&guvenPuanı<50) System.out.println("güvenilmez diyemem ama güvenilir de diyemeyiz");
        if (0<guvenPuanı&&guvenPuanı<20) System.out.println("güvenilmez");
        if (guvenPuanı<0) System.out.println("bu kişi kessinlikle güvenilmez");


    }

}