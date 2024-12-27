package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest_ValidInput_CreatesTable {

    private DBApp dbApp;

    @Test
    public void createTableTest_ValidInput_CreatesTable() throws DBAppException {
        dbApp = new DBApp();
        String tableName = "test_table";
        String clusteringKeyColumn = "test_column";
        java.util.Hashtable<String, String> colNameType = new java.util.Hashtable<>();
        colNameType.put("test_column", "test_type");
        java.util.Hashtable<String, String> colNameMin = new java.util.Hashtable<>();
        colNameMin.put("test_column", "test_min");
        java.util.Hashtable<String, String> colNameMax = new java.util.Hashtable<>();
        colNameMax.put("test_column", "test_max");
        dbApp.createTable(tableName, clusteringKeyColumn, colNameType, colNameMin, colNameMax);
        verify(dbApp, times(1)).createTable(tableName, clusteringKeyColumn, colNameType, colNameMin, colNameMax);
    }

}