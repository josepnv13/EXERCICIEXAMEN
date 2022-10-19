import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        int puntTotal=0;
        int maxPuntos=0;
        boolean algunMayorQue9= false;
        int minPuntos=Integer.MAX_VALUE;
        for(; ;){
            int puntos= scanner.nextInt();

            if(puntos==-1){
                break;
            }

            if(puntos>9){
                algunMayorQue9=true;
                contador++;
            }

            if (puntos > maxPuntos) {
                maxPuntos = puntos;
            }

            if (puntos < minPuntos) {
                minPuntos = puntos;
            }

            puntTotal=puntTotal+ puntos;
        }
        System.out.println(algunMayorQue9 + " " + contador + " "+ "veces");
        System.out.println(maxPuntos+" "+"es tu maxima puntuación en una partida");
        System.out.println(minPuntos+" "+"es tu minima puntuación en una partida");
        System.out.println(puntTotal+" "+ "puntos has conseguido en total");
    }
}
// 2 3 4 10 4 12 -1
