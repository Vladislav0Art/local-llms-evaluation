package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.selectFromTable(new SQLTerm[]{}, new String[]{});
    }

}