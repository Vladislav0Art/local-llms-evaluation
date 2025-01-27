package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedUpdateTable_updatesATableInTheDB {

    @Test
    public void updateTable_updatesATableInTheDB() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("strClusteringKeyColumn", "value");
        dbApp.updateTable("strTableName", "strClusteringKeyValue", htblColNameValue);
    }

}