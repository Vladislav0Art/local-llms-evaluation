package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedIsInitializedWithoutInitTest {

    private CssFormatter cssFormatter;

    @Test
    public void isInitializedWithoutInitTest() {
        cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());
    }

}