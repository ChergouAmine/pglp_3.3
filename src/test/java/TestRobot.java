import org.junit.Test;

public class TestRobot {

  @Test
  public void testConstructeurStatique() {
          RobotStatique r=new RobotStatique(5);
          assert(r.position==5);        
  }
  
  
  @Test
  public void testConstructeurDynamique() {
          RobotDynamique r=new RobotDynamique(5);
          assert(r.position==5);        
  }
  
  @Test
  public void testAvancer() {
          RobotDynamique r=new RobotDynamique(5);
          r.avancer();
          assert(r.position==15);        
  }
  
}
