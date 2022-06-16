import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hanseul", "AB123456C",40000, "Ministry of kitty kittens");
    }

    @Test
    public void hasAName(){
        assertEquals("Hanseul", manager.getName());
    }

    @Test
    public void hasANiNumber(){
        assertEquals("AB123456C", manager.getNinumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(40000, manager.getSalary(), 0.00);

    }

    @Test
    public void hasADepartment(){
        assertEquals("Ministry of kitty kittens", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.10);
        assertEquals(44000, manager.getSalary(),0.00);
    }

    @Test
    public void canHavePayBonus(){
       assertEquals(400, manager.payBonus(), 0.00);
    }

}
