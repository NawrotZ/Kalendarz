import java.util.Scanner;

public class Kalendarz {
    int rok = 365;
    int miesiace = 12;
//ilośc dni, deifniowanie dni w miesiecu, podliczanie jaki to dzien w miesiacu
    //dodawanie dni w miesiacu az zostanie reszta i to sa dni wtedy
    public static void main (String[] args){

        Kalendarz MyObj = new Kalendarz();
        int liczbadni = MyObj.userInput();
        MyObj.Data(liczbadni);

            }
    public void Data(int liczbaDni){
        int sum=1;
        for (int i = 1; i<=this.miesiace; i++) {

            if (liczbaDni>=28&&sum<miesiace) {

                if (i == 2) {
                    sum++;
                    liczbaDni -= 28;

                } else if (i % 2 == 0) {
                    sum++;
                    liczbaDni -= 30;

                } else {
                    sum++;
                    liczbaDni -= 31;
                }

            }

        }
        StringBuffer X = new StringBuffer("Jest " + liczbaDni + " dzień " + sum + " miesiąca" );
        System.out.println(X);

    }
    public int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz liczbe dni:");
        int number = input.nextInt();

        if (number>=this.rok) {
            System.out.println("Proszę na nowo wpisać liczę dni mniejszą niz 365");
            userInput();
        }
        return number;



    }
}
