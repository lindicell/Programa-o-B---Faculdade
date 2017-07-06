
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lianderson
 */
public class conexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        	


Class.forName( "com.mysql.jdbc.Driver" );

Connection conn = DriverManager.getConnection(
 "jdbc:mysql://intracker.com.br/fdb",
 "fdb",
 "fdb" );
try {
     Statement stmt = conn.createStatement();
try {
    //ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente WHERE color = 'blue'" );
    ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente" );
    try {
        while ( rs.next() ) {
            int numColumns = rs.getMetaData().getColumnCount();
            for ( int i = 1 ; i <= numColumns ; i++ ) {
               // Column numbers start at 1.
               // Also there are many methods on the result set to return
               //  the column as a particular type. Refer to the Sun documentation
               //  for the list of valid conversions.
               System.out.println( "COLUMN " + i + " = " + rs.getObject(i) );
            }
        }
    } finally {
        try { rs.close(); } catch (Throwable ignore) { /* Propagate the original exception
instead of this one that you may want just logged */ }
    }
} finally {
    try { stmt.close(); } catch (Throwable ignore) { /* Propagate the original exception
instead of this one that you may want just logged */ }
}
} finally {
    //It's important to close the connection when you are done with it
    try { conn.close(); } catch (Throwable ignore) { /* Propagate the original exception
instead of this one that you may want just logged */ }
}

        
        
        
        // TODO code application logic here
    }
}
