package ManavKasaProgrami;
import java.util.Scanner;
public class Manav_Kasa_Programi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, armutk, elma = 3.67, elmak, domates = 1.11, domatesk, muz = 0.95, muzk, patlıcan = 5.0, patlıcank, tutar;

        try{
            System.out.print("Armut kaç kilo aldınız? : ");
            armutk = input.nextDouble();
            System.out.print("Elma kaç kilo aldınız? : ");
            elmak = input.nextDouble();
            System.out.print("Domates kaç kilo aldınız? : ");
            domatesk = input.nextDouble();
            System.out.print("Muz kaç kilo aldınız? : ");
            muzk = input.nextDouble();
            System.out.print("Patlıcan kaç kilo aldınız? : ");
            patlıcank = input.nextDouble();            

        }finally{input.close();}

        tutar = (armut*armutk)+(elma*elmak)+(muz*muzk)+(domates*domatesk)+(patlıcan*patlıcank);

        System.out.println("Toplam tutar : "+tutar+" TL");
    }
}