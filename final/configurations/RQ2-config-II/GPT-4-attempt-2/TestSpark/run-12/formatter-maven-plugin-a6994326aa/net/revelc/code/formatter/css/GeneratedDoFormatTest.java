package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {color: black;}";
        String expectedFormattedCode = "body {\n    color: black;\n}";

        // Initialize and format code
        formatter.init(new HashMap<>(), null);
        String formattedCode = formatter.doFormat(code, LineEnding.AUTODTECT);

        Assert.assertEquals(expectedFormattedCode, formattedCode);
    }

}