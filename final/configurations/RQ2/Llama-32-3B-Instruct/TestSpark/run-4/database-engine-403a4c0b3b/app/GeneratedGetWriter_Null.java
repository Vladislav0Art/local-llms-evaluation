package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedGetWriter_Null {

    @Test
    public void getWriter_Null() {
        DBApp dbApp = new DBApp();
        assertNull(dbApp.getWriter());
    }

}