package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateTable_NameNotEmpty {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void updateTable_NameNotEmpty() {
        DBApp instance = testDBApp();
        instance.updateTable("TableName", "ClusteringKeyValue", new Hashtable<>());
        Mockito.verifyNoErrorsOrExceptions(instance.getReader());
    }

}