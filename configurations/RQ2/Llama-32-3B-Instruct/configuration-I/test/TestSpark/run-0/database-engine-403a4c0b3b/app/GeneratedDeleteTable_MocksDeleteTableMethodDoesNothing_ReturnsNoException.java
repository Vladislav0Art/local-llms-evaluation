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

public class GeneratedDeleteTable_MocksDeleteTableMethodDoesNothing_ReturnsNoException {

    @Test
    public void deleteTable_MocksDeleteTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.deleteTable("tableName")).thenAnswer(e -> {
        });
        try {
            dbApp.deleteTable("tableName");
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

}