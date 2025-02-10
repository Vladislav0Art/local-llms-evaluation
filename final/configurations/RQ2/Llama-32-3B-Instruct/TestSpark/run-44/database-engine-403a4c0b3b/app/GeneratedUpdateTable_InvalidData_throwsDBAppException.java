package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedUpdateTable_InvalidData_throwsDBAppException {

    @Test
    public void updateTable_InvalidData_throwsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        assertThrows(DBAppException.class, () -> dbApp.updateTable("tableName", "clusteringKeyColumn", htblColNameValue));
    }

}