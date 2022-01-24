


import ma.cigma.pfe.presentation.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.dao.IClientDao;
import  ma.cigma.pfe.models.*;

public class AppliccationRanner {



    public static void main(String[] args) {


        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");



        ClientController ctr = (ClientController) context.getBean("idCtrl");

        System.out.println(ctr.getService());


        Client client =new Client(1L,"testing");

        ctr.save(client);


    }

}
