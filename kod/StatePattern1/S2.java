
public class S2 extends State {

  public S2(StatesManager manager) {
    super(manager);
  }
  
  public void doB() {
    System.out.println("operacja B: S2 -> S1");
    changeState(new S1(manager));
  }

}
