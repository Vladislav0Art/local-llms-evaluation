package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInit_InitializedDatabase_ReturnsTrue {

    @Test
    public void init_InitializedDatabase_ReturnsTrue() throws DBAppException {
        DBApp dbApp = new DBApp();
        boolean initialized = dbApp.init();
        assertTrue(initialized);
    }

}