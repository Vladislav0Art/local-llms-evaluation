package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    private CssFormatter cssFormatter;

    @Test
    public void initTest() {
        var options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);
        Assertions.assertNotNull(cssFormatter.formatter);
    }

}