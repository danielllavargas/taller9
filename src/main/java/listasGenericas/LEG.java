package listasGenericas;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 9/08/13
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
public class LEG<E> {

    protected NodoLEG<E> primero;
    protected int talla;

    public LEG()
    {
        primero=null;
        talla=0;

    }

    public int talla()
    {
        return talla;

    }

    public void insertar( E x)
    {
        NodoLEG<E> nuevo= new NodoLEG<E>(x);
        nuevo.siguiente=primero;
        primero=nuevo;
        this.talla++;

    }

    public void insertarEnFin(E x)
    {
        NodoLEG<E> nl= new NodoLEG<E>(x);
        this.talla++;
        NodoLEG<E> aux= primero;

        if (aux==primero)
        {
            primero=nl;
        }else
        {
            while(aux.siguiente!=null)
            {
                aux=aux.siguiente;
                aux.siguiente=nl;
            }
        }


    }

    public boolean eliminar(E x)
    {
        NodoLEG<E> aux= primero,ant=null;
        boolean res=false;
        while(aux!=null && !aux.dato.equals(x))
        {
            if(aux!=null){
                res=true;
                this.talla--;
                if (ant==null)
                {
                    primero=aux.siguiente;
                } else
                {
                    ant.siguiente=aux.siguiente;
                }

            }
        }
        return res;
    }

    public String toString()
    {
        String res="";
        for(NodoLEG<E> aux=primero;aux!=null;aux=aux.siguiente )
        {
            res +=aux.dato.toString() + "\n";


        }

        return res;
    }

}
