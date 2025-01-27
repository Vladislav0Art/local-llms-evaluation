package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.io.IOException;

import org.w3c.css.sac.InputSource;

public class GeneratedIsInitialized_ReturnsTrueWhenInitWasCalled {

    @Test
    public void isInitialized_ReturnsTrueWhenInitWasCalled() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), new ConfigurationSource());
        assertTrue(formatter.isInitialized());
    }

}