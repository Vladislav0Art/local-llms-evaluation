package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");
        htblColNameValue.put("Age", 30);

        dbApp.insertIntoTable("Persons", htblColNameValue);

        Mockito.verify(dbApp).insertIntoTable(Mockito.anyString(), Mockito.any(Hashtable.class));
    }

}