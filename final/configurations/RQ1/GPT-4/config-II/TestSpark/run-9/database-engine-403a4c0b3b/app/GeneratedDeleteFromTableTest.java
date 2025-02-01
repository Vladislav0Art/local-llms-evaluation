package app;

import app.DBApp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import util.validation.Validator;

import java.io.IOException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedDeleteFromTableTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("test", htblColNameValue);
        Mockito.verify(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
    }

}