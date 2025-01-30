package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedDoFormatReturnNullTest {

    @Test
    public void doFormatReturnNullTest() throws Exception {
        String originalCode = "body {\\n background-color: #ffffff; }";

        CssFormatter cssFormatter = new CssFormatter();

        // Initializing formatter.
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);

        String returnedCode = cssFormatter.doFormat(originalCode, LineEnding.AUTO);

        assertNull("Return code should be null", returnedCode);
    }

}