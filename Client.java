public class Client {
    public static void main(String[] args) {
        Vagon ca1=new CalatoriA();
        Vagon cb1=new CalatoriB();
        Vagon m1=new Marfa();
        Vagon[] v1={ca1,cb1,m1};
        Tren t1=new Tren(v1);
        t1.afisareTipuriVagoane();//afiseaza: Vagon 1: CalatoriA  Vagon 2: CalatoriB  Vagon 3: Marfa 
        Tren t2=new Tren(v1);
        System.out.println(t1.equals(t2));//afiseaza: true
        Vagon[] v2={ca1,cb1};
        Tren t3=new Tren(v2);
        System.out.println(t1.equals(t3));//afiseaza: false
    }
}
