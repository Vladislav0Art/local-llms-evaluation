package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedInit_ThrowsDBAppException {

    @Test
    public void init_ThrowsDBAppException() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}