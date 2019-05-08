package njpo;

public abstract class Ingredient implements Burger {

    private Burger component;

    public Ingredient(Burger component) {
        this.component = component;
    }

    public String decorate() {
        return component.decorate();
    }
}
