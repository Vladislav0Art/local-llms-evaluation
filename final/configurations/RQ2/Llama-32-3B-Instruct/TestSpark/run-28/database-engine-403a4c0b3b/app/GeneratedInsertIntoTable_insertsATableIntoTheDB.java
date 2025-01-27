package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedInsertIntoTable_insertsATableIntoTheDB {

    @Test
    public void insertIntoTable_insertsATableIntoTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.insertIntoTable("strTableName", htblColNameValue);
    }

}