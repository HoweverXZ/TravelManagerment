package DAO;

import DBUtils.Druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
    static Connection connection;

    static {
        try {
            connection = Druid.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet selectAll(String database) {
        ResultSet res = null;
        try {
            PreparedStatement pstm = connection.prepareStatement("SELECT * FROM " + database);
            res = pstm.executeQuery();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addAndUpdateInformation(String sql, String... args) throws Exception {
        Connection con = null;
        try {
            con = Druid.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pstm.setObject(i + 1, args[i]);
            }
            pstm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            Druid.closeConnection(con);
        }
    }

    public static ResultSet selectOne(String sql, Connection con, String... args) {
        PreparedStatement pstm = null;
        ResultSet res = null;
        try {
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pstm.setObject(i + 1, args[i]);
            }
            res = pstm.executeQuery();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet login(String sql, Connection con, String... args) {
        PreparedStatement pstm = null;
        ResultSet res = null;
        try {
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pstm.setObject(i + 1, args[i]);
            }
            res  = pstm.executeQuery();
            return res;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int packageCode(){
        int code = 0;
        try {
            ResultSet res = JDBC.selectOne("select package_code from tour_packages",Druid.getConnection());
            while (res.next()){
                code=res.getInt(1);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }
}
