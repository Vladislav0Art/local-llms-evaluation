package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedInitWithInvalidOptionTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initWithInvalidOptionTest() throws UnsupportedOperationException {
        Map<String, String> options = new HashMap<>();
        options.put("invalid", "option");
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(UnsupportedOperationException.class, () -> cssFormatter.init(options, cfg));
    }

}