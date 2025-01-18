package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTableExceptionTest {

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = spy(DBApp.class);
        doThrow(new DBAppException("Test Exception"))
                .when(dbApp).deleteFromTable(anyString(), any(Hashtable.class));
        dbApp.deleteFromTable("tableTest", new Hashtable<>());
    }

}