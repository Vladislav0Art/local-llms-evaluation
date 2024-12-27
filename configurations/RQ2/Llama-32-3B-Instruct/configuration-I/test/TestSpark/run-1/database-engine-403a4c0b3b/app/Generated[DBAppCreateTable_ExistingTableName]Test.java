package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppCreateTable_ExistingTableName]

Test {

    @Test
    public void [DBAppCreateTable_ExistingTableName]Test() throws DBAppException {
        CSVReader csvReader = mock(CsvReader.class);
        CsvWriter csvWriter = mock(CsvWriter.class);
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.init();
        when(DBApp.class).init().thenReturn(csvReader, csvWriter);
        DBApp dbApp = new DBApp();
        dbApp.createTable("existingTable", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

}