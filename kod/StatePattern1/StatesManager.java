
public class StatesManager {
  private State state;
  
  public StatesManager() {
    state = new S1(this); //domyślny stan
  }
  
  public void changeState(State state) {
    this.state = state;
  }
  
  public void doA() {
    state.doA();
  }
  
  public void doB() {
    state.doB();    
  }
}
