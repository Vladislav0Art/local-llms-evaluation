package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedCreateTable_InvalidData_throwsDBAppException {

    @Test
    public void createTable_InvalidData_throwsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        assertThrows(DBAppException.class, () -> dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax));
    }

}