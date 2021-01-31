public class AnimalJava {
    private String  name , gender  ;
    int age;

    public AnimalJava(String name, String gender) {
        this.name = name;

        if (!gender.equals("male") && !gender.equals("female")){
            this.gender = "male";
        }else {
            this.gender = gender;
        }
    }

    public AnimalJava(String name, String gender, int age) {
        this(name, gender);
        this.age = age;
    }


}

