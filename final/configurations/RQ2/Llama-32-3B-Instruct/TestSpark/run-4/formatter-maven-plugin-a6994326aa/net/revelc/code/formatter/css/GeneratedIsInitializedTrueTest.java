package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitializedTrueTest {

    @Test
    public void isInitializedTrueTest() {
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

}