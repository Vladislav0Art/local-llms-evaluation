package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedUpdateTableFailTest_DBAppException {

    @Test
    public void updateTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable(null, null, null);
    }

}