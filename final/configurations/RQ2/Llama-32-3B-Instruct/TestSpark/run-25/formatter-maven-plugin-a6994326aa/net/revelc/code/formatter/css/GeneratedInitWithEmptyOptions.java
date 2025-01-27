package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.ByteArrayInputStream;

import com.steadystate.css.sac.InputSource;

public class GeneratedInitWithEmptyOptions {

    @Test
    public void initWithEmptyOptions() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

}