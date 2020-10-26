package menu;

public class Card {
    public static final int PICAS   = 4;
    public static final int CORAZONES   = 3;
    public static final int TREBOLES    = 2;
    public static final int DIAMANTES = 1;

    private static final String[] Palo = { "*", "d", "t", "c", "p"};
    private static final String[] Valor = { "*", "*", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private byte cardPalo;
    private byte cardValor;

    public Card( int palo, int valor )
    {
        if ( valor == 1 )
            cardValor = 14;     // Dar a As el valor 14
        else
            cardValor = (byte) valor;

        cardPalo = (byte) palo;
    }

    public int palo()
    {
        return ( cardPalo );
        //   this.cardPalo
    }

    public String paloStr()
    {
        return( Palo[ cardPalo ] );
        //   this.Palo[ this.cardPalo ]
    }

    public int valor()
    {
        return ( cardValor );
    }

    public String valorStr()
    {
        return ( Valor[ cardValor ] );
    }

    public String toString()
    {
        return ( Valor[ cardValor ] + Palo[ cardPalo ] );
    }
}
