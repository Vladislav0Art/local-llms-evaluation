package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedDoFormatWithNullCodeAndEndingTest {

    @Test
    public void doFormatWithNullCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat(null, null);
    }

}