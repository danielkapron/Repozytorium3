public class Trojkat {

    // Oblicz pole poweirzchni i obwod
    // Figura geometryczna któr ma 3 boki
    // składowe: podstawa, wysokość, dlugosc pierwszego i drugiego boku

    private double podstawa;
    private double wysokosc;
    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;

    // mozemy uzyc menu code ->generate





    public double obliczPolePowierzchni(){
        return podstawa * wysokosc / 2;
    }

    public double obliczObwod(){
        return  podstawa + dlugoscPierwszegoBoku + dlugoscDrugiegoBoku;
    }




    public void setPodstawa(double podstawa){
        this.podstawa = podstawa;
    }

    public void setWysokosc(double wysokosc){
        this.wysokosc = wysokosc;
    }

    public void setDlugoscPierwszegoBoku(double dlugoscPierwszegoBoku){
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
    }

    public void setDlugoscDrugiegoBoku(double dlugoscDrugiegoBoku){
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }

}
