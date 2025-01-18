package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableExceptionTest {

    @Test
    public void updateTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, null, null);
    }

}