package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.css.sac.InputSource;

public class GeneratedIsInitializedTest {

    private CssFormatter cssFormatter;

    @Test
    public void isInitializedTest() {
        cssFormatter = spy(new CssFormatter());

        when(cssFormatter.isInitialized()).thenReturn(true);

        assertEquals(true, cssFormatter.isInitialized());
    }

}