import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Mark", "BBB232425BB", 70000, "Head of kittens", 100000);
    }


    @Test
    public void hasAName(){
        assertEquals("Mark", director.getName());
    }

    @Test
    public void hasANiNumber(){
        assertEquals("BBB232425BB", director.getNinumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(70000, director.getSalary(), 0.00);

    }

    @Test
    public void hasADepartment(){
        assertEquals("Head of kittens", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.10);
        assertEquals(77000, director.getSalary(),0.00);
    }

    @Test
    public void canHavePayBonus(){
        assertEquals(700, director.payBonus(), 0.00);
    }

    @Test
    public void hasABudget(){
        assertEquals(100000, director.getBudget(), 0.00);
    }
}
