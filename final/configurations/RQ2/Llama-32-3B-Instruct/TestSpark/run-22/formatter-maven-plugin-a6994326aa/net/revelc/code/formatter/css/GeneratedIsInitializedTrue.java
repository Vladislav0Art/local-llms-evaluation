package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

import static org.mockito.Mockito.when;

public class GeneratedIsInitializedTrue {

    @Test
    public void isInitializedTrue() {
        final CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

}