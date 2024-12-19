package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestGetMyTables {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetMyTables() {
        HashSet<String> myTables = new HashSet<>();
        myTables.add("table1");
        myTables.add("table2");
        when(mockDatabase.getMyTables()).thenReturn(myTables);
        assertEquals(2, dbApp.getMyTables().size());
    }

}