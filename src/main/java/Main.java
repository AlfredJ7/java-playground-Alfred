public class Main {
        public static void main(String[] args) {
            Cat coco = new Cat("coco", 14);
            Dog max = new Dog("max", 5, "Alfred");
            Rabbit rabbit= new Rabbit("snow ball", 3, "black");
            Toy robot = new Toy("Curious George");

            Toy legoCar = new Toy("Lego Truck");


            Action[] animals = new Action[]{coco, max, rabbit, robot};
            for(Action friend : animals){
                friend.play(legoCar);
            }



        }

}
