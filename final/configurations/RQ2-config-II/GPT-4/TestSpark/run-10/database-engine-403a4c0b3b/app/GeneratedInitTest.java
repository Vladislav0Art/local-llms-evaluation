package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;

import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
        dbApp.init();
    }

}