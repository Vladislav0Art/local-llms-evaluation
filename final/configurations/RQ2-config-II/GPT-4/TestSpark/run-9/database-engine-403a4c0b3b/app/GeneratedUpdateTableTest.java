package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.updateTable("test_table", "test_key", new Hashtable<>());
    }

}