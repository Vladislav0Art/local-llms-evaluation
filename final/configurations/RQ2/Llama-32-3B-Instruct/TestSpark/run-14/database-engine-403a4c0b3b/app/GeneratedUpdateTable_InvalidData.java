package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedUpdateTable_InvalidData {

    private DBApp dbApp = new DBApp();

    @Test
    public void updateTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "");
        dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue);
    }

}