package Pasquier;

public abstract class FormeGeometrique {
    //attributs d'instance
    protected double x;
    protected double y;

    public FormeGeometrique(double x, double y) {
        this.x = x;
        this.y = y;
    }



    //getters et setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //methodes
    public void deplacer(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void afficher(){
        System.out.println("FormeGeometrique{" +
                "x=" + x +
                ", y=" + y +
                '}');
    }

    //methodes abstraites
    public abstract double perimetre();
    public abstract double surface();
}
