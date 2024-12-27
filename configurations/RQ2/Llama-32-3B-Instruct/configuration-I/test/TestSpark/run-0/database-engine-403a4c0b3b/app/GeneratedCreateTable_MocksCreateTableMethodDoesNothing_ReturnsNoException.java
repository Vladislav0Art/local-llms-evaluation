package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

public class GeneratedCreateTable_MocksCreateTableMethodDoesNothing_ReturnsNoException {

    @Test
    public void createTable_MocksCreateTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax)).thenAnswer(e -> {
        });
        try {
            dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

}