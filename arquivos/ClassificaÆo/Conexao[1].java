
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    Class.forName("com.mysql.jdbc.Driver");

    Connection conexao = DriverManager.getConnection("jdbc:mysql://intracker.com.br/fdb", "fdb", "fdb" );

    try 
    {
         Statement stmt = conexao.createStatement();
    try 
    {
        ResultSet consulta = stmt.executeQuery( "SELECT * FROM lindice_titulo" );
        try 
        {
            while (consulta.next()) 
            {
                   System.out.println(consulta.getString("titulo"));
                   System.out.println(consulta.getString("idade"));
            
            }
        } 
        
        finally 
        {
            try 
            {
                consulta.close(); 
            } 
            catch (Throwable ignore) 
            { 

            }
        }
    } finally 
        {
            try 
            { 
                stmt.close(); 
            } 
            catch (Throwable ignore) 
            { 

            }
        }
    } 
        finally 
        {

            try 
            { 
                conexao.close(); 
            } 
            catch (Throwable ignore) 
            { 

            }
        }
    }
}
