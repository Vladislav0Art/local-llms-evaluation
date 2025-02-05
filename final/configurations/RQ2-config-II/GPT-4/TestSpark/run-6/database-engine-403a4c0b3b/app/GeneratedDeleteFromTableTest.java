package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");

        dbApp.deleteFromTable("Persons", htblColNameValue);

        Mockito.verify(dbApp).deleteFromTable(Mockito.anyString(), Mockito.any(Hashtable.class));
    }

}