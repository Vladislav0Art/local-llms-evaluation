package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedDeleteFromTable_deletesATableFromTheDB {

    @Test
    public void deleteFromTable_deletesATableFromTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.deleteFromTable("strTableName", htblColNameValue);
    }

}