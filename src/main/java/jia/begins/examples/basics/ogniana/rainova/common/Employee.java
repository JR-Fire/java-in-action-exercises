package jia.begins.examples.basics.ogniana.rainova.common;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * User: jr-fire
 * Date: Nov 6, 2010
 * Time: 7:08:41 AM
 */
public class Employee implements IEmployee {
    private String m_firstName; 
    private String m_lastName; 
    private int m_age; 
    private String m_position; 
    private BigDecimal m_pay;

    public Employee(String firstName, String lastName, int age, String position, BigDecimal pay) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setPosition(position);
        this.setPay(pay);
    }

    public Employee(IEmployee employee)
    {
        this(employee.getFirstName(),employee.getLastName(), employee.getAge(),employee.getPosition(),employee.getPay());
    }

    public Employee()
    {
        this("","", 0,"",BigDecimal.ZERO);
    }

    @Override
    public String getFirstName() {
        return m_firstName;
    }

    @Override
    public void setFirstName(String m_firstName) {
        this.m_firstName = m_firstName;
    }

    @Override
    public String getLastName() {
        return m_lastName;
    }

    @Override
    public void setLastName(String m_lastName) {
        this.m_lastName = m_lastName;
    }

    @Override
    public int getAge() {
        return m_age;
    }

    @Override
    public void setAge(int m_age) {
        this.m_age = m_age;
    }

    @Override
    public String getPosition() {
        return m_position;
    }

    @Override
    public void setPosition(String m_position) {
        this.m_position = m_position;
    }

    @Override
    public BigDecimal getPay() {
        return m_pay;
    }

    @Override
    public void setPay(BigDecimal m_pay) {
        this.m_pay = m_pay;
    }

    @Override
    public String toString(){
        return String.format("%12s\t%20s\t%3d\t%20s\t%s", getFirstName(), getLastName(), getAge(), getPosition(), NumberFormat.getCurrencyInstance().format(getPay()));
    }
}
