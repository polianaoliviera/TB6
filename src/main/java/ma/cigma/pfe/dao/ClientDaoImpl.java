package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.dao.IClientDao;




public class ClientDaoImpl implements IClientDao{


    public ClientDaoImpl () {
        System.out.println("appel constrtr de la classe clientdaoimpl");
    }




    @Override
    public boolean save(Client c) {

        System.out.println("dao");
        return false;
    }

}
