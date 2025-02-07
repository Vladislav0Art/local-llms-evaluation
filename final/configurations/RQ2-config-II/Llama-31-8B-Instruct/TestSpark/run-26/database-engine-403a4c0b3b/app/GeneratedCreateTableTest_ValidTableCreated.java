package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest_ValidTableCreated {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTableTest_ValidTableCreated() throws DBAppException {
        String tableName = "table1";
        String clusteringKeyColumn = "column1";
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("column1", "type1");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("column1", "min1");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("column1", "max1");
        dbApp.createTable(tableName, clusteringKeyColumn, colNameType, colNameMin, colNameMax);
        verify(dbApp, times(1)).getWriter();
    }

}