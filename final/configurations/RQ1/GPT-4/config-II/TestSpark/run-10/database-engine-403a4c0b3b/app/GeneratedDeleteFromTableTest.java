package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import storage.Table;
import util.filecontroller.Serializer;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();

        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable(strTableName, htblColNameValue);
    }

}