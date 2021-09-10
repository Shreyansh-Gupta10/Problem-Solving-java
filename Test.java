package oops.encapsulation;

class Person{
    private int height;
    private int weight;
    private String name;
    private String phone;
    private String address;

    //setter function
    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getter function
    public int getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public String grtAddress(){
        return this.address;
    }

}
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Shreyansh");
        p.setHeight(165);
        p.setWeight(60);
        p.setPhone("9027687404");
        p.setAddress("Ena Enterprises Jwalapur");

        System.out.println(p.getName());
        System.out.println(p.getHeight());
        System.out.println(p.getWeight());
        System.out.println(p.getPhone());
        System.out.println(p.grtAddress());
        
    }
    
}
