package uvsq21601245;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class managertest {

    @Test
    public void testSalairemanager(){
        manager m= new manager(5,1);
        m.set_salaire(m.calcul_salaire());
        assertEquals(m.get_salaire(),2020);
    }
}
