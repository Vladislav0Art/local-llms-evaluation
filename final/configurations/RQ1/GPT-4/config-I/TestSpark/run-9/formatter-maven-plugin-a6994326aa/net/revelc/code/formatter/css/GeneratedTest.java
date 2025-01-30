package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void initDefaultValuesTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void initCustomValuesTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "3");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body {background-color: #ffffff;} h1 {color: black;}";
        Assert.assertNotNull(formatter.doFormat(code, LineEnding.CRLF));
    }

    @Test
    public void doFormatTabsTo9Test() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body {background-color:\t#ffffff;} h1 {color:\tblack;}";
        Assert.assertTrue(formatter.doFormat(code, LineEnding.CRLF).contains("\\9;"));
    }

    @Test
    public void doFormatSameCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String code = "body{background-color:#ffffff;}h1{color:black;}";
        Assert.assertNull(formatter.doFormat(code, LineEnding.CRLF));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}