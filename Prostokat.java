public class Prostokat {

    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;



    public double obliczObwod(){
        return dlugoscPierwszegoBoku * 2 + dlugoscDrugiegoBoku * 2;
    }

    public double obliczPolePowierzchni(){
        return dlugoscPierwszegoBoku * dlugoscDrugiegoBoku;
    }




    public void setDlugoscPierwszegoBoku(double dlugoscPierwszegoBoku){
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
    }

    public void setDlugoscDrugiegoBoku(double dlugoscDrugiegoBoku){
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }



}
