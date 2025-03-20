package myjava;
class Addition{
    public  int add(int a ,int b) {
        int a = 10;
        int b = 20;
        System.out.println("Sum of a&b is"+(a+b))
    }
    public  int add(int a ,int b) {
        return a+b                                                                   
}
public class MethodOverloading{
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(10,20);
        System.out.println("sum of a&b " + obj.add(200,300))
    }
}