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

public class GeneratedGetMyTablesShouldReturnValidTableNames {

    @Test
    public void getMyTablesShouldReturnValidTableNames() throws DBAppException {
        DBApp db = new DBApp();
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");
        assertEquals(tables, db.getMyTables());
    }

}