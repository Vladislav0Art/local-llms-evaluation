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

public class GeneratedUpdateTable_MocksUpdateTableMethodDoesNothing_ReturnsNoException {

    @Test
    public void updateTable_MocksUpdateTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.updateTable("tableName", htblColNameValue)).thenAnswer(e -> {
        });
        try {
            dbApp.updateTable("tableName", htblColNameValue);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

}