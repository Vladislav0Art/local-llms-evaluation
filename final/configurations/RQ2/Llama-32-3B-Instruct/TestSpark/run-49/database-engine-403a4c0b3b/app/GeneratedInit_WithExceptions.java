package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedInit_WithExceptions {

    private DBApp db = new DBApp();

    @Test
    public void init_WithExceptions() {
        throw new DBAppException("init exception");
        db.init(null);
    }

}