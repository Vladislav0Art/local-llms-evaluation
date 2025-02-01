package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedUpdateTableValidTest {

    @Test
    public void updateTableValidTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.anyString(), Mockito.any(Hashtable.class));
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

}