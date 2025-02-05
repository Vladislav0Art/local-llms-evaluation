package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;

import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateTableNotExistTableTest {

    @Test
    public void updateTableNotExistTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.updateTable("myTable", "val1", colNameValue);
    }

}