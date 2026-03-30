/* =========================================================
File: DateBean.java
========================================================= */

import java.util.Date;

public class DateBean {
    Date d;

    public void setD(Date d) {
        this.d = d;
    }

    public void showDate() {
        System.out.println("Current Date: " + d);
    }
}


/* =========================================================
File: beans.xml
========================================================= */

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="dateBean" class="DateBean">
        <property name="d">
            <bean class="java.util.Date"/>
        </property>
    </bean>

</beans>


/* =========================================================
File: Test.java
========================================================= */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("beans.xml");

        DateBean obj = (DateBean) context.getBean("dateBean");
        obj.showDate();
    }
}
