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

public class GeneratedSelectFromTable_MocksSelectFromTableMethodDoesNothing_ReturnsNoIterator {

    @Test
    public void selectFromTable_MocksSelectFromTableMethodDoesNothing_ReturnsNoIterator() throws DBAppException, Iterator.EmptyIteratorException {
        when(dbApp.selectFromTable(SQLTerm[].class, strarrOperators)).thenAnswer(e -> {
        });
        try {
            dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"op"});
            fail("Expected Iterator.EmptyIteratorException");
        } catch (Iterator.EmptyIteratorException e) {
            // expected
        }
    }

}