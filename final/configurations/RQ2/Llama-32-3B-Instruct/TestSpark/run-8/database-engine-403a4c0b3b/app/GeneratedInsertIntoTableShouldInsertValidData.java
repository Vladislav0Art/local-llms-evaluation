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

public class GeneratedInsertIntoTableShouldInsertValidData {

    @Test
    public void insertIntoTableShouldInsertValidData() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("name", "John Doe");
        data.put("age", 30);
        db.insertIntoTable("table1", data);
    }

}