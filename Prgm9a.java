interface Nameable{
    public void setName(String name);
    public String getName();
}
class Person implements Nameable{
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Prgm9a{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("John");
        System.out.println("Name of the person is " + p.getName());
    }
}