package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitializedBeforeInitTest {

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();

        assertEquals(false, formatter.isInitialized());
    }

}