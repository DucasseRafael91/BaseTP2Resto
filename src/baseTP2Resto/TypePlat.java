package baseTP2Resto;

public class TypePlat {
	
	private int id;
	private String nom_type_plat;
	
    // Constructeur
    public TypePlat(String nom_type_plat) {
        this.id = id;
        this.nom_type_plat = nom_type_plat;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNomTypePlat() {
        return nom_type_plat;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNomTypePlat(String nom_type_plat) {
        this.nom_type_plat = nom_type_plat;
    }

}
