import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pavan","root","pavan");
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("select * from emp1");
                ){
                System.out.println("Empno EmpName EmpSalary EmpAdd");
                System.out.println("--------------------------------------");
                while(resultSet.next()){
                    System.out.print(resultSet.getInt("EmpNo")+"\t");
                    System.out.print(resultSet.getString("EmpName")+"\t");
                    System.out.print(resultSet.getFloat("EmpSalary")+"\t"+"\t");
                    System.out.print(resultSet.getString("EmpAdd")+"\n");
                }


        }catch(Exception e){
            System.out.println(e);

        }

    }
}
