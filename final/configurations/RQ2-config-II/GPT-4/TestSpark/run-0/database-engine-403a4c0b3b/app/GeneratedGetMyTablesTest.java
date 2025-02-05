package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMyTablesTest {

    @Mock
    LinkedHashMap<String, Object> map;

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getMyTables() instanceof HashSet);
    }

}