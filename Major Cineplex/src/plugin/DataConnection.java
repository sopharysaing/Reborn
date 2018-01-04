/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MacBookPro
 */
public class DataConnection {
    private static Connection dataConnection;
    public static void connectionDB(String username, String password, String dbName, String server) throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        setDataConnection(DriverManager.getConnection("jdbc:mysql://"+server+"/"+dbName,username,password));
        
    }

    /**
     * @return the dataConnection
     */
    public static Connection getDataConnection() {
        return dataConnection;
    }

    /**
     * @param aDataConnection the dataConnection to set
     */
    public static void setDataConnection(Connection aDataConnection) {
        dataConnection = aDataConnection;
    }
}
