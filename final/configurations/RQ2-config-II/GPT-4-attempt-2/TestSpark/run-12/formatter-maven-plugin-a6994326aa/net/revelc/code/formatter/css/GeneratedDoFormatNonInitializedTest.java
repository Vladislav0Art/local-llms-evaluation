package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class GeneratedDoFormatNonInitializedTest {

    @Test
    public void doFormatNonInitializedTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {color: black;}";

        // Attempt to format code without initializing should throw exception
        formatter.doFormat(code, LineEnding.AUTODTECT);
    }

}