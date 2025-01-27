package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.io.IOException;

import org.w3c.css.sac.InputSource;

public class GeneratedIsInitialized_ReturnsFalseWhenInitWasNotCalled {

    @Test
    public void isInitialized_ReturnsFalseWhenInitWasNotCalled() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}