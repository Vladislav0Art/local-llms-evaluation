package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedDoFormatSameCodeTest {

    @Test
    public void doFormatSameCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body{background-color:#ffffff;}h1{color:black;}";
        Assert.assertNull(formatter.doFormat(code, LineEnding.CRLF));
    }

}