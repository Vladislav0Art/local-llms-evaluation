package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map;

public class GeneratedDeleteFromTable_MocksDeleteFromTableMethodDoesNothing_ReturnsNoException {

    @Test
    public void deleteFromTable_MocksDeleteFromTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.deleteFromTable("tableName", htblColNameValue)).thenAnswer(e -> {
        });
        try {
            dbApp.deleteFromTable("tableName", htblColNameValue);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

}