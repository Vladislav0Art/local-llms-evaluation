package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableExceptionTest {

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.deleteFromTable(null, colNameValue);
    }

}