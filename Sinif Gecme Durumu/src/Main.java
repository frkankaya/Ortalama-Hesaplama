import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        Matematik = inp.nextInt();
        System.out.println("Fizik Notunuz :");
        Fizik = inp.nextInt();
        System.out.println("Turkce Notunuz :");
        Turkce = inp.nextInt();
        System.out.println("Kimya Notunuz :");
        Kimya = inp.nextInt();
        System.out.println("Muzik Notunuz :");
        Muzik = inp.nextInt();

        if (Matematik > 100 || 0 > Matematik){
            Matematik = 0;
        }if (Fizik > 100 || 0 > Fizik){
            Matematik = 0;
        }if (Turkce > 100 || 0 > Turkce){
            Matematik = 0;
        }if (Kimya > 100 || 0 > Kimya){
            Matematik = 0;
        }if (Muzik > 100 || 0 > Muzik){
            Matematik = 0;
        }

        double avrg = (Matematik + Fizik + Turkce + Kimya + Muzik) /5;

        if (avrg > 55){
            System.out.println("Sinifi Gectiniz");
        }else{
            System.out.println("Sinifta Kaldiniz");
        }
        System.out.println(avrg);
    }
}