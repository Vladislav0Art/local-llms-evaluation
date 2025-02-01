package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp app = new DBApp();
        try {
            app.selectFromTable(null, null);
        } catch (DBAppException e) {
            fail();
        }
    }

}