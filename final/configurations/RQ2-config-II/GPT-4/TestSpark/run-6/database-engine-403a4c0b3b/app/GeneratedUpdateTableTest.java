package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");
        htblColNameValue.put("Age", 31);

        dbApp.updateTable("Persons", "John", htblColNameValue);

        Mockito.verify(dbApp).updateTable(Mockito.anyString(), Mockito.anyString(), Mockito.any(Hashtable.class));
    }

}