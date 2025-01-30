package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedDoFormatTabsTo9Test {

    @Test
    public void doFormatTabsTo9Test() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body {background-color:\t#ffffff;} h1 {color:\tblack;}";
        Assert.assertTrue(formatter.doFormat(code, LineEnding.CRLF).contains("\\9;"));
    }

}