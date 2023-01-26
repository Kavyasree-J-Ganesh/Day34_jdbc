package bridgelabz;

public class JDBCMain {
    public static void main(String[] args) {
       EmpPayRollDBService service = new EmpPayRollDBService();
       System.out.println(service.readData());
    }
}
