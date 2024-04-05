public enum Fruits {
    ORANGE,
    APPLE

}


class Fruit {
    final static int ORANGE = 1;
    final static int APPLE = 2;

}

class MainFile {

    public static void main(String[] args) {
        int fruit1 = Fruit.APPLE;
        switch (fruit1) {
            case 1:
                System.out.println("Orange");
                break;
            case 2:
                System.out.println("Apple");
                break;

        }

        Fruits fruit = Fruits.APPLE;
        switch (fruit){
            case ORANGE:
                System.out.println(Fruits.ORANGE);
                break;
            case APPLE :
                System.out.println(Fruits.APPLE);
                break;
        }
    }
}