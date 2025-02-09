package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTestWithSampleCode {

    @Test
    public void doFormatTestWithSampleCode() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        String result = formatter.doFormat("body{background-color:#ffffff;}", LineEnding.AUTO);
        assertEquals("body {\n    background-color: #ffffff;\n}\n", result);
    }

}