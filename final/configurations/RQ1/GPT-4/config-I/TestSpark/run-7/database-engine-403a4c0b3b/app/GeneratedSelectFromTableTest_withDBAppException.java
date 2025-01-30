package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest_withDBAppException {

    @Test
    public void selectFromTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] strarrOperators = {"=", ">", "<"};
        dbApp.selectFromTable(null, strarrOperators);
    }

}