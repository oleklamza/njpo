
public class S1 extends State {

  public S1(StatesManager manager) {
    super(manager);
  }

  public void doA() {
    System.out.println("operacja A: S1 -> S2");
    changeState(new S2(manager));
  }
  
}
