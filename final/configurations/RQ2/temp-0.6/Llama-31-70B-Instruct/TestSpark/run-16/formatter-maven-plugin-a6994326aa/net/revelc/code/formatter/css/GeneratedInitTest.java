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

public class GeneratedInitTest {

    private CssFormatter cssFormatter;

    @Test
    public void initTest() {
        cssFormatter = spy(new CssFormatter());
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);

        when(options.get("option1")).thenReturn("value1");
        when(options.get("option2")).thenReturn("value2");

        cssFormatter.init(options, cfg);

        assertNotNull(cssFormatter);
    }

}