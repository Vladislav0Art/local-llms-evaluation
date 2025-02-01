package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedDoFormatReturnNullTest {

    @Test
    public void doFormatReturnNullTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String output = formatter.doFormat("body {\n    color: black;\n}\n", LineEnding.UNIX);

        assertEquals(null, output);
    }

}