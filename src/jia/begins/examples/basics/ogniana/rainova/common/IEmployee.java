package jia.begins.examples.basics.ogniana.rainova.common;

import java.math.BigDecimal;

public interface IEmployee {
	String getFirstName();

    void setFirstName(String m_firstName);

    String getLastName();

    void setLastName(String m_lastName);
    
    int getAge();

    void setAge(int m_age);

    String getPosition();

    void setPosition(String m_position);

    BigDecimal getPay();

    void setPay(BigDecimal m_pay);

    @Override
    String toString();
}
