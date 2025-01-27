package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTable_NameNotEmpty {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void createTable_NameNotEmpty() {
        DBApp instance = testDBApp();
        instance.createTable("TableName", "ClusteringKeyColumn", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        Mockito.verifyNoErrorsOrExceptions(instance.getReader());
    }

}