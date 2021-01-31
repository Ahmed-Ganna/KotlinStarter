public class AnimalJava2 {
    String name ;

    public AnimalJava2(String name) {
        this.name = name;
    }
}
class  Zoo extends AnimalJava2 {
    String color;

    public Zoo(String name) {
        super(name);
    }
}
