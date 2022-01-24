package ma.cigma.pfe.models;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter


public class Client {
    private long id;
    private String nom;



    public Client(long i, String string) {
        // TODO Auto-generated constructor stub
    }



    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + "]";
    }



/*public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}*/



}
