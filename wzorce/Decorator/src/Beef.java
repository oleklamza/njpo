package njpo;

public class Beef extends Ingredient {
    public Beef(Burger component) {
        super(component);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with beef";
    }

}
