public class point {
    double x;
    double y;
    double z;

    public point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double scX(){
        return x;
    }
    public void soX(){
        this.x = x;
    }

    public double scY(){
        return y;
    }
    public void soY(){
        this.y = y;
    }

    public double scZ(){
        return z;
    }
    public void soZ(){
        this.z = z;
    }

    public void print(){
        System.out.println("x: " + scX());
        System.out.println("y: " + scY());
        System.out.println("z: " + scZ());
    }


}
