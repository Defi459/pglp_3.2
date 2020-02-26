package uvsq21601245;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class employetest {

    @Test
    public void testSalaire(){
        employe e = new employe(0);
        assertEquals(e.get_salaire(),1500);
    }

    @Test
    public void testAnciennete(){
        employe e =new employe(5);
        assertEquals(e.get_salaire(),1600);
    }

    @Test
    public void testNouvelleAnnee(){
        employe e = new employe(0);
        e.nouvelle_annee();
        assertEquals(e.get_salaire(),1520);
    }

    @Test
    public void testCalculSalaire(){
        employe e= new employe(0);
        e.set_anciennete(10);
        e.set_salaire(e.calcul_salaire());
        assertEquals(e.get_salaire(),1700);
    }
}
