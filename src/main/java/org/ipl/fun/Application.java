package org.ipl.fun;


import org.ipl.fun.dao.PersonDao;
import org.ipl.fun.data.DataUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"org.ipl.fun"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {


    public static void main(String[] args) {
      /*  ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Long id = context.getBean(PersonDao.class).addPerson(DataUtil.getPerson());
        context.getBean(PersonDao.class).listPersons();
        context.getBean(PersonDao.class).deletePerson(id);
        System.out.println(id);
        */
    }

}