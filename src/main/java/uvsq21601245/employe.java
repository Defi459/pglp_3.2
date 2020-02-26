package uvsq21601245;

public class employe {

    private int salaire;
    private int anciennete;

    employe(int anciennete){

        this.anciennete=anciennete;
        this.salaire=1500+20*anciennete;

    }

    void nouvelle_annee(){

        anciennete++;
        this.salaire=1500+20*anciennete;

    }

    int get_salaire(){
        return this.salaire;
    }

    int get_anciennete(){
        return this.anciennete;
    }


}
