package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        String code = "body {font-size: 14px;}";
        CssFormatter formatter = new CssFormatter();
        LineEnding ending = LineEnding.AUTO;

        String formattedCode = formatter.doFormat(code, ending);

        Assert.assertNotNull(formattedCode);
        Assert.assertTrue(formattedCode.trim().length() > 0);
    }

}