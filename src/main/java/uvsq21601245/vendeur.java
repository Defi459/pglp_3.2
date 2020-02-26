package uvsq21601245;

public class vendeur extends employe {

    private int commission;

    public vendeur(int commission,int anciennete){
        super(anciennete);
        this.commission=commission;
    }

    public int get_commission(){
        return this.commission;
    }

    public void set_commission(int commission){
        this.commission=commission;
    }

    @Override
    public int calcul_salaire(){
        return super.calcul_salaire()+commission;
    }

}
