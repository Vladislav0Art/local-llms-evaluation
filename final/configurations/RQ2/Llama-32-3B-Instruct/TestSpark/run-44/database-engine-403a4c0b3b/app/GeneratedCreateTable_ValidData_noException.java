package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedCreateTable_ValidData_noException {

    @Test
    public void createTable_ValidData_noException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

}