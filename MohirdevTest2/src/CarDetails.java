public class CarDetails {
    String color;
    String model;
    double price;
    String type;
    public CarDetails(){

    }

    public CarDetails(String color, String model, double price, String type) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.type = type;
    }
    public void print(){
        System.out.println("Mashina xaqida info ");
        System.out.println("Rangi: " + color);
        System.out.println("Modeli: " + model);
        System.out.println("Narxi: " + price);
        System.out.println("Typesi: " + type);

    }
}
