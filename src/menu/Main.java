package menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck a;
        Card[] hand = new Card[5];
        int i;
        a = new Deck();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opcion:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Shuffle. Se mezcló el Deck: ");
                a.shuffle(1000);
                System.out.println(a);
                break;
            case 2:
                Card head;
                head = a.deal();
                System.out.println("Head: " + head);
                System.out.println("Quedan 51 cartas en deck. \n");
                break;
            case 3:
                a.shuffle(1000);
                Card pick;
                pick = a.deal();
                System.out.println("Pick: " + pick);
                System.out.println("Quedan 50 cartas en deck. \n");
                break;
            case 4:
                a.shuffle(1000);
                for (i = 0; i < 5; i++) {
                    hand[i] = a.deal();
                }

                System.out.print("Hand: ");
                for (i = 0; i < 5; i++)
                    System.out.print(hand[i] + "  ");
                System.out.println();
                System.out.println("Quedan 45 cartas en el Deck. \n");
                break;
            case 0:
                break;
        }}
        while (opcion > 0 && opcion < 5);

        if (opcion > 4){
            System.out.println("Opción no válida");
            do {
                opcion = sc.nextInt();
            }
            while (opcion > 0 && opcion < 5);
        }
    }
}
