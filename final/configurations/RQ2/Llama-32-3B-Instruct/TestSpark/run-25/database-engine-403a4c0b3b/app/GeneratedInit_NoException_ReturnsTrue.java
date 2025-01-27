package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInit_NoException_ReturnsTrue {

    @Test
    public void init_NoException_ReturnsTrue() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(true);
    }

}