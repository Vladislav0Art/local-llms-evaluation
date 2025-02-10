package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedUpdateTable_ValidData_noException {

    @Test
    public void updateTable_ValidData_noException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue);
    }

}