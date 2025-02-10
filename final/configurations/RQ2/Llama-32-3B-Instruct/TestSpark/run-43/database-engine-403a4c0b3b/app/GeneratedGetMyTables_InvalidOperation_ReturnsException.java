package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetMyTables_InvalidOperation_ReturnsException {

    @Test
    public void getMyTables_InvalidOperation_ReturnsException() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init(); // Initialize the database with one table
        dbApp.getMyTables(); // Attempt to get my tables without initializing the database
    }

}