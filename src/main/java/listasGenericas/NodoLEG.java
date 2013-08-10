package listasGenericas;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 9/08/13
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class NodoLEG <E> {

    E dato;
    NodoLEG siguiente;

    public NodoLEG(E dato)
    {
        this(dato,null);
    }

    public NodoLEG(E dato, NodoLEG<E> siguiente )
    {
        this.dato=dato;
        this.siguiente=siguiente;



    }


}
