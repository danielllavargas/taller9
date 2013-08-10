package listasGenericas;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 9/08/13
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class LEGTest {


    @Test
    public void testTalla() throws Exception {

    }

    @Test
    public void testInsertar() throws Exception {

        LEG<Integer> i= new LEG<Integer>();

        i.insertar(new Integer(9));
        i.insertar(new Integer(10));
        i.insertar(new Integer(11));
        i.insertar(new Integer(12));

        System.out.println("la lista es" + "\n" + i.toString());
    }

    @Test
    public void testInsertarEnFin() throws Exception {

    }

    @Test
    public void testEliminar() throws Exception {

    }

    @Test
    public void testToString() throws Exception {
        LEG<Integer> i= new LEG<Integer>();

    }



}
