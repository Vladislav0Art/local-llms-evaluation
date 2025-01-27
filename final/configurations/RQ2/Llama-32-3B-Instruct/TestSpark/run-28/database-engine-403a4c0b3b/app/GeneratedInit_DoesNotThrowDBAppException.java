package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedInit_DoesNotThrowDBAppException {

    @Test
    public void init_DoesNotThrowDBAppException() {
        new DBApp().init();
    }

}