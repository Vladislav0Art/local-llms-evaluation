package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestInit {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void testInit() {
        // given
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        // when
        formatter.init(options, cfg);
        // then
        assertNotNull(formatter);
    }

}