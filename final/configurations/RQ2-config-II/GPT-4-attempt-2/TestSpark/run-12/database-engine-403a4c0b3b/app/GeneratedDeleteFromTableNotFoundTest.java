package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedDeleteFromTableNotFoundTest {

    @Test
    public void deleteFromTableNotFoundTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> columnNameValues = new Hashtable<>();
        columnNameValues.put("EmployeeID", 1);
        dbApp.deleteFromTable("NonExistingTable", columnNameValues);
    }

}