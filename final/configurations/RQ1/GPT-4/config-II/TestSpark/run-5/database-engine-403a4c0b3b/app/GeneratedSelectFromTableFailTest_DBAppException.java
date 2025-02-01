package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableFailTest_DBAppException {

    @Test
    public void selectFromTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.selectFromTable(new SQLTerm[0], new String[0]);
    }

}