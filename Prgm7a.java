class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
    double circumference(){
        return 2*3.14*radius;
    }
    public String toString() {
        return "Circle radius = " + radius + ", area = " + area() + ", circumference = " + String.format("%.2f",circumference());
    }
    
}

class Prgm7a{
    public static void main(String args[]){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);
        c1.setRadius(5);
        c2.setRadius(10);
        c3.setRadius(15);
        System.out.println("Area of c1 is "+c1.area());
        System.out.println("Circumference of c1 is "+ String.format("%.2f", c1.circumference()));
        System.out.println("Area of c2 is "+c2.area());
        System.out.println("Circumference of c2 is "+ String.format("%.2f", c2.circumference()));
        System.out.println("Area of c3 is "+c3.area());
        System.out.println("Circumference of c3 is "+ String.format("%.2f", c3.circumference()));
       System.out.println(c1.toString());
    }
}