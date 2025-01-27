package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedUpdateTable_ValidData {

    private DBApp dbApp = new DBApp();

    @Test
    public void updateTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value2");
        dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue);
    }

}