package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> columnNameType = new Hashtable<>();
        columnNameType.put("EmployeeID", "Integer");
        Hashtable<String, String> columnNameMin = new Hashtable<>();
        columnNameMin.put("EmployeeID", "1");
        Hashtable<String, String> columnNameMax = new Hashtable<>();
        columnNameMax.put("EmployeeID", "999999");
        dbApp.createTable("Employee", "EmployeeID", columnNameType, columnNameMin, columnNameMax);
    }

}