import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jen", "EFG987654H", 50000);
    }

    @Test
    public void hasAName(){
        assertEquals("Jen", developer.getName());
    }

    @Test
    public void hasANiNumber(){
        assertEquals("EFG987654H", developer.getNinumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(50000, developer.getSalary(), 0.00);

    }



    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.20);
        assertEquals(60000, developer.getSalary(),0.00);
    }

    @Test
    public void canHavePayBonus(){
        assertEquals(500, developer.payBonus(), 0.00);
    }

}
