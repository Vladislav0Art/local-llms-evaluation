package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitNullConfigurationSourceTest {

    @Test
    public void initNullConfigurationSourceTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
    }

}