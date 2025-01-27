package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedCreateTable_ValidData {

    private DBApp dbApp = new DBApp();

    @Test
    public void createTable_ValidData() throws DBAppException, IOException, CsvValidationException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column2", "minValue");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column3", "maxValue");
        dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

}