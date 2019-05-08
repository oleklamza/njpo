package njpo;

public class Main {

    public static void main(String[] args) {

        Burger b = new BurgerBun();
        b = new Beef(b);


        System.out.println(b.decorate());

    }
}
