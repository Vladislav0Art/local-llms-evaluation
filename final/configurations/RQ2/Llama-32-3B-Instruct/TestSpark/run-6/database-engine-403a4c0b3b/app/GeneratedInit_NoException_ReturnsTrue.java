package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class GeneratedInit_NoException_ReturnsTrue {

    private final DBApp db = new DBApp();

    @Test
    public void init_NoException_ReturnsTrue() {
        boolean actual = db.init();
        assertTrue(actual);
    }

}