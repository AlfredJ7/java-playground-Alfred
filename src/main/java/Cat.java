public class Cat extends Animal {
    public void play(){
        System.out.print("CAT" + name + " jumps on the table");
    }

    // constructor
    public Cat(String name, int age){
        super(name,age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public void play(Toy toy){
        System.out.println("Cat " + name + " is playing with the toy " + toy);
    }
}
