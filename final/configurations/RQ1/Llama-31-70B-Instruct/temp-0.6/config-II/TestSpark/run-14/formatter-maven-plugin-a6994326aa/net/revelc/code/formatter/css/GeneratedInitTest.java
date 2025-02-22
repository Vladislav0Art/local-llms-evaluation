package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter.formatter);
    }

}