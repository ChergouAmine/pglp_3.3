
public class RobotDynamique extends Robot {

  public RobotDynamique(int position) {
      super(position);
  }
  
  @Override
  public void avancer() {
      super.position += 10;
  }
}