package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTestWithSameInputAndOutput {

    @Test
    public void doFormatTestWithSameInputAndOutput() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String inputCode = "body {\n    background-color: black\n}";
        String result = cssFormatter.doFormat(inputCode, LineEnding.AUTO);
        assertNull(result);
    }

}