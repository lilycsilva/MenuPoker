package menu;

public class Deck {
    public static final int NCARDS = 52;

    private Card[] deckOfCards;         // Contiene las 52 cartas
    private int currentCard;

    public Deck( )
    {
        deckOfCards = new Card[ NCARDS ];

        int i = 0;

        for ( int palo = Card.DIAMANTES; palo <= Card.PICAS; palo++ )
            for ( int valor = 1; valor <= 13; valor++ )
                deckOfCards[i++] = new Card(palo, valor);

        currentCard = 0;
    }

    //Shuffle del deck
    public void shuffle(int n)
    {
        int i, j, k;

        for ( k = 0; k < n; k++ )
        {
            i = (int) ( NCARDS * Math.random() );  // Elige 2 cartas al azar
            j = (int) ( NCARDS * Math.random() );  // en el deck

            //swap de las cartas elegidas al azar
            Card tmp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[j];
            deckOfCards[j] = tmp;
        }

        currentCard = 0;
    }

    //Deal deckOfCards[currentCard] out - Remover la carta del deck
    public Card deal()
    {
        if ( currentCard < NCARDS )
        {
            return ( deckOfCards[ currentCard++ ] );
        }
        else
        {
            System.out.println("Out of cards error");
            return ( null );  // Error
        }
    }


    public String toString()
    {
        String s = "";
        int k;

        k = 0;
        for ( int i = 0; i < 4; i++ )
        {
            for ( int j = 1; j <= 13; j++ )
                s += (deckOfCards[k++] + " ");

            s += "\n";
        }
        return ( s );
    }
}
