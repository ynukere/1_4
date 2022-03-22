import java.util.Scanner; 
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Kalkulator");
    
    Scanner myObj = new Scanner(System.in);  
    int x=1;
    while(x>0)
    {
      System.out.println("Naciśnij 1 by rozpocząć");
      x=myObj.nextInt();
    
      switch (x)
        {
          case 1:
            {
              System.out.println("Co chcesz zrobić?");
              System.out.println("1 - Liczba do potęgi");
              System.out.println("2 - Suma pierwiastków");
              System.out.println("3 - max");
              System.out.println("4 - mnożenie");
              int y=myObj.nextInt();
              double liczba1, liczba2, wynik;
              wynik=0;
              if(y==1)
              {
                System.out.println("Liczba do potęgi");
                System.out.println("Podaj A:");
                liczba1= myObj.nextFloat();
                System.out.println("Podaj B:");
                liczba2= myObj.nextFloat();
                wynik= Math.pow(liczba1, liczba2);
              }
              else if(y==2)
              {
                System.out.println("Wybrałeś sumę pierwiastków");
                System.out.println("Podaj A:");
                liczba1= myObj.nextFloat();
                System.out.println("Podaj B:");
                liczba2= myObj.nextFloat();
                double sqrt1 = Math.sqrt(liczba1);
                double sqrt2 = Math.sqrt(liczba2);
                wynik= sqrt1+sqrt2;
              }
              else if(y==3)
              {
                System.out.println("Wybrałeś max");
                System.out.println("Podaj A:");
                liczba1= myObj.nextFloat();
                System.out.println("Podaj B:");
                liczba2= myObj.nextFloat();
                wynik= Math.max(liczba1, liczba2);
              }
              else if(y==4)
              {
                System.out.println("Wybrałeś mnożenie");
                System.out.println("Podaj pierwszą liczbę:");
                liczba1= myObj.nextFloat();
                System.out.println("Podaj drugą liczbę:");
                liczba2= myObj.nextFloat();
                wynik= liczba1*liczba2;
              }
              System.out.println("Wynik twojej operacji to: "+wynik);
            }break;
        }   
    }
   
  }
}