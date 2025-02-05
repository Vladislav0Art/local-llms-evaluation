package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.deleteFromTable("test_table", new Hashtable<>());
    }

}