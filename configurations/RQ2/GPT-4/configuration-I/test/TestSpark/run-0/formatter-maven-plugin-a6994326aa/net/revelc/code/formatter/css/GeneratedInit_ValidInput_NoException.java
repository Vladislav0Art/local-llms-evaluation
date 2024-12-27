package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedInit_ValidInput_NoException {

    @Test
    public void init_ValidInput_NoException() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<String, String>();

        cssFormatter.init(options, null);

        assertNotNull(cssFormatter);
    }

}