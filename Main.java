import RepairSchedule;
public class Main{
  public static void main(String[] args){
    RepairSchedule rs = new RepairSchedule(3);
    System.out.println(rs.addRepair(1, 2));
    System.out.println(rs.addRepair(2, 2));
    System.out.println(rs.addRepair(2, 3));
    System.out.println(rs.availableMechanics());
  }
}
