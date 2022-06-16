import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Andrew", "LMN123456K", 30000);
    }

    @Test
    public void hasAName(){
        assertEquals("Andrew", dataBaseAdmin.getName());
    }

    @Test
    public void hasANiNumber(){
        assertEquals("LMN123456K", dataBaseAdmin.getNinumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(30000, dataBaseAdmin.getSalary(), 0.00);

    }



    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(0.20);
        assertEquals(36000, dataBaseAdmin.getSalary(),0.00);
    }

    @Test
    public void canHavePayBonus(){
        assertEquals(300, dataBaseAdmin.payBonus(), 0.00);
    }

}
