public class Kwadrat {

    private double dlugoscBoku;



    public double obliczObwod(){
        return dlugoscBoku * 4;
    }

    public double obliczPolePowierzchni(){
        return  dlugoscBoku * dlugoscBoku;
    }



    public void setDlugoscBoku(double dlugoscBoku){
        this.dlugoscBoku = dlugoscBoku;
    }


}
