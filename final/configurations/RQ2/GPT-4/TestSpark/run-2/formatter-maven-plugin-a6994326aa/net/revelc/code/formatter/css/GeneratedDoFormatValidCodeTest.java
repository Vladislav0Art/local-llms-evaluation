package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.nio.file.Paths;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: blue; }";
        String formattedCode = formatter.doFormat(code, LineEnding.LF);
        Assert.assertEquals("body {\n  color: blue;\n}\n", formattedCode);
    }

}