package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body {background-color: #ffffff;} h1 {color: black;}";
        Assert.assertNotNull(formatter.doFormat(code, LineEnding.CRLF));
    }

}