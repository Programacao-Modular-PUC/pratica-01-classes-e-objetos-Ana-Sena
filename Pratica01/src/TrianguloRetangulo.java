public class TrianguloRetangulo {
    private double c1;
    private double c2;
    private double h;
    private double area;

    public TrianguloRetangulo(){
        c1 = 0.0;
        c2 = 0.0;
        h = 0.0;
        area = 0.0;
    }

    public void setC1(double c1) {this.c1 = c1;}
    public double getC1() {return c1;}

    public void setC2(double c2) {this.c2 = c2;}
    public double getC2() {return c2;}

    public void setH(double h) {this.h = h;}
    public double getH() {return h;};

    public void setArea(double area) {this.area = area;}
    public double getArea() {return area;}

    public double CalculaHipotenusa(){
        setH(Math.sqrt((Math.pow(getC1(), 2) + Math.pow(getC2(), 2))));
        return h;
    }

    public double CalculaArea(){
        setArea((getC1() * getC2())/2);
        return area;
    }

}
