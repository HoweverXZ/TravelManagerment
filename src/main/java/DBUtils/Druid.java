package DBUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Druid {
    private static DataSource sources;
    static {
        try {
            Properties pros = new Properties();

            InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("Druid.properties");
            pros.load(resourceAsStream);

            sources = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
    public static Connection getConnection() throws Exception{
        Connection conn = sources.getConnection();
        return conn;
    }

    public static void closeConnection(Connection conn)  {
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void closeResultSet(ResultSet res)  {
        try {
            res.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}