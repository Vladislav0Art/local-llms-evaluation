package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitNullParametersTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initNullParametersTest() {
        formatter.init(null, null);

        assertEquals(false, formatter.isInitialized());
    }

}