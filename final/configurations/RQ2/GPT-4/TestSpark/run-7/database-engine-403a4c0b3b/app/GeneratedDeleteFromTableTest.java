package app;

import org.junit.Test;

import java.util.Hashtable;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.deleteFromTable("test", colNameValue);
    }

}