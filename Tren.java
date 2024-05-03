public class Tren{
    private Vagon[] vagoane;
    public Tren(Vagon[] vagoane){
        if(vagoane.length>15)
            System.out.println("Nu se pot introduce decat 15 vagoane");
        else
            this.vagoane=vagoane;
    }
    public Vagon getVagon(int i){
        if(i>14||i<0){
            System.out.println("trenul nu are vagonul "+i);
            return null;
        }
        return vagoane[i];
    }
    public int calculeazaCapacitateaTotalaDeColete(){
        int s=0;
        for(Vagon v:vagoane){
            if(v==null)
                break;
            if(v instanceof CalatoriA)
                s+=300;
            else
                s+=400;
        }
        return s;
    }
    public boolean equals(Tren t){
        if(this.calculeazaCapacitateaTotalaDeColete()==t.calculeazaCapacitateaTotalaDeColete())
            return true;
        return false;
    }
    public void afisareTipuriVagoane(){
        String s="";
        int i=1;
        for(Vagon v:vagoane){
            if(v==null)
                break;
            s=s+"Vagon "+i+": "+v.getClass().getName()+"  ";
            i++;
        }
        System.out.println(s);
    }
}