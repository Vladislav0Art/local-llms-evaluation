package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMyTablesTest {

    @Mock
    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        HashSet<String> expected = new HashSet<>();
        expected.add("testTable");
        when(dbApp.getMyTables()).thenReturn(expected);
        assertEquals(expected, dbApp.getMyTables());
    }

}