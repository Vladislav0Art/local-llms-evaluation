package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDeleteFromTable_InvalidParameters_ThrowsDBAppException {

    @Test
    public void deleteFromTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        assertThrows(DBAppException.class, () -> dbApp.deleteFromTable("table1", htblColNameValue));
    }

}