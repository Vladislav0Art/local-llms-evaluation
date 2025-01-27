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

public class GeneratedGetReader_ThrowsIOException {

    private final DBApp db = new DBApp();

    @Test
    public void getReader_ThrowsIOException() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(bos);
            db.getReader().open(ps, null);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}