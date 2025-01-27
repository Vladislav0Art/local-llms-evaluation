package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTable_NameNotEmpty {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void deleteFromTable_NameNotEmpty() {
        DBApp instance = testDBApp();
        instance.deleteFromTable("TableName", new Hashtable<>());
        Mockito.verifyNoErrorsOrExceptions(instance.getReader());
    }

}