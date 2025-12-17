package baseTP2Resto;

public class Plat {
	
	private int id;
	private String nom;
	private TypePlat type_plat;
	
    // Constructeur
    public Plat(String nom, TypePlat type_plat) {
        this.id = id;
        this.nom = nom;
        this.type_plat = type_plat;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    
    public TypePlat getTypePlat() {
        return type_plat;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setTypePlat(TypePlat type_plat) {
        this.type_plat = type_plat;
    }

}
