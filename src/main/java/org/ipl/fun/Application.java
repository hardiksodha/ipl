package org.ipl.fun;


import org.ipl.fun.dao.PersonDao;
import org.ipl.fun.model.ContactDetail;
import org.ipl.fun.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"org.ipl.fun"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Long id = context.getBean(PersonDao.class).addPerson(getPerson());
        context.getBean(PersonDao.class).listPersons();
        context.getBean(PersonDao.class).deletePerson(id);
        System.out.println(id);
    }

    public static Person getPerson() {
        Person person1 = new Person();
        person1.setFirstName("Ajay");
        person1.setLastName("Jadeja");
        person1.setAge(25);
        person1.setCity("Ahmedabad");
        person1.setGender("Male");
        person1.setOccupation("Student");

        ContactDetail contactDetail = new ContactDetail();
        contactDetail.setEmail("rjadea@gmail.com");
        contactDetail.setMobile("432432432");
        contactDetail.setLandLine("043-432423");


        person1.setContactDetailList(Arrays.asList(contactDetail));
        return person1;
    }

}