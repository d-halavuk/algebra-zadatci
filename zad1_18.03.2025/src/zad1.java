import java.util.Scanner;

public class zad1 {

    public static void main(String[] args){

        double novcanice[] = {500, 200, 100, 50, 20, 10, 5};

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite zeljeni iznos: ");
        String iznos = input.nextLine();
        double iznos_broj = Double.parseDouble(iznos);


        for(double novcanica : novcanice){

            int brojNovcanica = 0;
            while (iznos_broj >= novcanica) {
                iznos_broj -= novcanica;
                brojNovcanica++;
            }

            System.out.println((int)novcanica + "€: " + brojNovcanica + " kom");

        }


    }



}
