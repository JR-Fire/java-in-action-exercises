package jia.begins.examples.basics.ogniana.rainova.common;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * User: jr-fire
 * Date: Nov 6, 2010
 * Time: 7:47:38 AM
 */
public class ANewEmployeeShould {
    private IEmployee employee;

    @Before
    public void setUp() {
        employee = new Employee("Lilah", "Pierce", 13, "babysitter", new BigDecimal(500));
    }

    @Test
    public void getFirstName() {
        assertEquals(employee.getFirstName(), "Lilah");
    }

    @Test
    public void setNewFirstName() {
        String name = "Ginger";
        employee.setFirstName(name);
        assertEquals(employee.getFirstName(), name);
    }

    @Test
    public void getLastName() {
        assertEquals(employee.getLastName(), "Pierce");
    }

    @Test
    public void setNewLastName() {
        String name = "Benton";
        employee.setLastName(name);
        assertEquals(employee.getLastName(), name);
    }

    @Test
    public void getAge() {
        assertEquals(employee.getAge(), 13);
    }

    @Test
    public void setNewAge() {
        employee.setAge(23);
        assertEquals(employee.getAge(), 23);
    }

    @Test
    public void getPosition() {
        assertEquals(employee.getPosition(), "babysitter");
    }

    @Test
    public void setNewPosition() {
        String position = "student";
        employee.setPosition(position);
        assertEquals(employee.getPosition(), position);
    }

    @Test
    public void getPay() {
        assertEquals(employee.getPay(), new BigDecimal(500));
    }

    @Test
    public void setNewPay() {
        BigDecimal salary = new BigDecimal(1024);
        employee.setPay(salary);
        assertEquals(employee.getPay(), salary);
    }
}
