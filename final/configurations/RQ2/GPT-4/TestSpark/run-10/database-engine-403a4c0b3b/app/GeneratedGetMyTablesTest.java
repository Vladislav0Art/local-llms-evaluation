package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        app.getMyTables();
    }

}