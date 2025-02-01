package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedCreateTableFailTest_DBAppException {

    @Test
    public void createTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.createTable(null, null, null, null, null);
    }

}