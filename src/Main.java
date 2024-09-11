import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] nomeJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //inicializacao; condicao; incremento
        // ++ vai somar +1 i = i + i
        for (int i = 0; i < 10; i++ ){
            System.out.println("Informe o nome do Player " + i);
            nomeJogadores[i] = sc.next();
        }

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 Nomes)
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes)

        System.out.println("Informe o time A");
       String nomeTimeA = sc.next();

       String[] nomePlayerTimeA = new String[5];

       for(int i = 0; i < 5; i++ ){
           System.out.println("Informe o Player" + i);
           nomePlayerTimeA[i] = sc.next();
       }
        System.out.println("Informe o time B");
        String nomeTimeB = sc.next();

        String[] nomePlayerTimeB = new String[5];

        for(int i = 0; i < 5; i++ ){
            System.out.println("Informe o Player" + i);
            nomePlayerTimeA[i] = sc.next();



}
}
}