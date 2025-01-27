package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedSelectFromTableShouldReturnIterator {

    @Test
    public void selectFromTableShouldReturnIterator() throws DBAppException {
        DBApp db = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[]{"select *"};
        String[] operators = new String[]{};
        Iterator iterator = db.selectFromTable(sqlTerms, operators);
        assertNotNull(iterator);
    }

}