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

public class GeneratedCreateTableShouldCreateValidTable {

    @Test
    public void createTableShouldCreateValidTable() throws DBAppException, IOException {
        DBApp db = new DBApp();
        Hashtable<String, String> tableDefinition = new Hashtable<>();
        tableDefinition.put("id", "int");
        tableDefinition.put("name", "string");
        db.createTable("table1", "id", tableDefinition, null, null);
    }

}