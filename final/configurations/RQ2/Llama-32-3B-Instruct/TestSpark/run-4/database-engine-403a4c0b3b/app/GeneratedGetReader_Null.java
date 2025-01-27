package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedGetReader_Null {

    @Test
    public void getReader_Null() {
        DBApp dbApp = new DBApp();
        assertNull(dbApp.getReader());
    }

}