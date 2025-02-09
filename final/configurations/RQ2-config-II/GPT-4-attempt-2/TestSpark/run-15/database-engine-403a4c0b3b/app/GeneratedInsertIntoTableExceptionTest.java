package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedInsertIntoTableExceptionTest {

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("NonExistentTable", htblColNameValue);
    }

}