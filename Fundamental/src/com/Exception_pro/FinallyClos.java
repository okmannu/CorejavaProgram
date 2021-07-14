package Exception_pro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyClos {
    public static void main(String[] args)   /*  throws IOException*/
    {                                                                 // second option

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // Do stuff
        } catch (Exception e) {
            // Exception
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                // ignore
            }

            try {
                cn.close();
            } catch (SQLException e) {
                // ignore
            }
            try {
                ps.close();
            } catch (SQLException e) {
                // ignore
            }
        }
    }
}
