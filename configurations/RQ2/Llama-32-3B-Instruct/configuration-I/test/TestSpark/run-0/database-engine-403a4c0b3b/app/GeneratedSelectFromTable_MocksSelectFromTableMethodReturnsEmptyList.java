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

public class GeneratedSelectFromTable_MocksSelectFromTableMethodReturnsEmptyList {

    @Test
    public void selectFromTable_MocksSelectFromTableMethodReturnsEmptyList() throws DBAppException, Iterator.EmptyIteratorException {
        when(dbApp.selectFromTable(SQLTerm[].class, strarrOperators)).thenAnswer(e -> new ArrayList<>());
        try {
            dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"op"});
            fail("Expected EmptyIteratorException");
        } catch (Iterator.EmptyIteratorException e) {
            // expected
        }
    }

}