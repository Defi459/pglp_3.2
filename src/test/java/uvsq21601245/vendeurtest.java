package uvsq21601245;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class vendeurtest {

    @Test
    public void testSalaireVendeur(){
        vendeur v= new vendeur(100,1);
        v.set_salaire(v.calcul_salaire());
        assertEquals(v.get_salaire(),1620);
    }
}
