package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Mock
    LinkedHashMap<String, Object> map;

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("table", "key", map, map, map);
    }

}