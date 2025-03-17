public class Zadatak {
    public static void main(String[] args) {

        for (int broj = 1; broj < 10000; broj++) {
            int originalniBroj = broj;
            int suma = 0;
            int tempVar = broj;
            int brojZnamenki = 0;


            while (tempVar > 0) {
                brojZnamenki = brojZnamenki + 1;
                tempVar = tempVar / 10;
            }

            tempVar = broj;

            while (tempVar > 0) {
                int znamenka = tempVar % 10;

                int potencija = (int) Math.pow(znamenka, brojZnamenki);

                suma = suma + potencija;
                tempVar = tempVar / 10;
            }

            if (suma == originalniBroj) {
                System.out.println(originalniBroj);
            }
        }
    }
}
