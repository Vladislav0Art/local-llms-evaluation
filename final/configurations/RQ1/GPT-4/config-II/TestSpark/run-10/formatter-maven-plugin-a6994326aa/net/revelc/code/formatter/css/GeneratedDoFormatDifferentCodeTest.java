package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedDoFormatDifferentCodeTest {

    @Test
    public void doFormatDifferentCodeTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();

        formatter.init(options, Mockito.mock(ConfigurationSource.class));

        // The input CSS code has wrong "color" spelling and different indentation
        String code = "body\n{\n   background-colour: #ffffff;\n}";
        assertNotNull(formatter.doFormat(code, LineEnding.AUTO));
    }

}