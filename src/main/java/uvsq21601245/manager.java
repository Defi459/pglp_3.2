package uvsq21601245;

public class manager extends employe{

    int subalterne;

    public manager(int subalterne, int anciennete){
        super(anciennete);
        this.subalterne= subalterne;
    }

    @Override
    public int calcul_salaire(){
        return super.calcul_salaire()+(subalterne*100);
    }

}
