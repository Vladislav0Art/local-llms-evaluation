package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedInit_ThrowsDBAppException {

    private DBApp dbApp = new DBApp();

    @Test
    public void init_ThrowsDBAppException() {
        dbApp.init();
    }

}