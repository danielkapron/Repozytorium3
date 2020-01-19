public class Kolo {

    private double promien;


    public double obliczObwod(){
        return 2 * Math.PI * promien;
    }

    public double obliczPolePowierzchni(){
        return Math.PI * promien * promien;
    }


    public void setPromien(double promien){
        this.promien = promien;
    }

}
