package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        HashSet<String> expected = new HashSet<>();
        expected.add("testTable");
        when(dbApp.getMyTables()).thenReturn(expected);
        assertEquals(expected, dbApp.getMyTables());
    }

    @Test
    public void initTest() {
        // TODO: write test code for init() method
    }

    @Test
    public void createTableTest() {
        // TODO: write test code for createTable() method
    }

    @Test
    public void insertIntoTableTest() {
        // TODO: write test code for insertIntoTable() method
    }

    @Test
    public void updateTableTest() {
        // TODO: write test code for updateTable() method
    }

    @Test
    public void deleteFromTableTest() {
        // TODO: write test code for deleteFromTable() method
    }

    @Test
    public void selectFromTableTest() {
        // TODO: write test code for selectFromTable() method
    }

}