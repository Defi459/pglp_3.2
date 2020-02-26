package uvsq21601245;

public class employe {

    private int salaire;
    private int anciennete;

    public  employe(int anciennete){

        this.anciennete=anciennete;
        this.salaire=1500+20*anciennete;

    }

    public void nouvelle_annee(){

        anciennete++;
        this.salaire=1500+20*anciennete;

    }

    public int get_salaire(){
        return this.salaire;
    }

    public void set_salaire(int salaire){

        this.salaire=salaire;

    }

    public int calcul_salaire(){
        return 1500 + 20*this.anciennete;
    }

    public int get_anciennete(){
        return this.anciennete;
    }

    public void set_anciennete(int anciennete){
        this.anciennete=anciennete;
    }


}
