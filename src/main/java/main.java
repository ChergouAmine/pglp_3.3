import java.util.ArrayList;

public  class main {

  public static void main( String[] args )
  {
      ArrayList<Robot> Robots = new ArrayList<Robot>();
      //Robots.add(new RobotStatique(20));
      Robots.add(new RobotDynamique(20));
      Robots.add(new RobotDynamique(50));
      for(int i = 0; i <Robots.size(); i++) Robots.get(i).avancer();
      for(int i = 0; i <Robots.size(); i++) System.out.println("position Robot "+i+" : "+Robots.get(i).position);
      
  }

}
