package org.ipl.fun.data;

import org.ipl.fun.model.ContactDetail;
import org.ipl.fun.model.Person;

import java.util.Arrays;

/**
 * Created by Hardik on 24-03-2017.
 */
public class DataUtil {
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
