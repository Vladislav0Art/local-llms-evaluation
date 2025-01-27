package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTable_InvalidName {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void createTable_InvalidName() {
        DBApp instance = testDBApp();
        instance.createTable("", "ClusteringKeyColumn", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}