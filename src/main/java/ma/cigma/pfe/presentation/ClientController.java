package ma.cigma.pfe.presentation;




import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.servic.*;


public class ClientController {

    IClientService service ;

    public IClientService getService() {

        return service;
    }


    public void setservice (IClientService service) {
        System.out.println("appel constrctor de classe client controller");
        this.service=service;

    }

    public ClientController() {

    }


    public boolean save (Client c) {
        System.out.println("presentation");
        service.save(c);
        return service.save(c);

    }

}
