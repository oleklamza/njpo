
public abstract class State {
  protected StatesManager manager;
  
  public State(StatesManager manager) {
    this.manager = manager;
  }
    
  public void changeState(State state) {
    manager.changeState(state);
  }
  
  public void doA() {
    System.out.println("***");
  }
  
  public void doB() {
    System.out.println("***");    
  }
}
