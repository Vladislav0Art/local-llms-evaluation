package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateTable_InvalidName {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void updateTable_InvalidName() {
        DBApp instance = testDBApp();
        instance.updateTable("", "ClusteringKeyValue", new Hashtable<>());
    }

}