package net.revelc.code.formatter.css;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.steadystate.css.dom.CSSStyleSheetImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

public class GeneratedIsInitializedTest {

    private CssFormatter formatter;

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        assertEquals(Boolean.FALSE, formatter.isInitialized());
        formatter.init(new HashMap<>(), null);
        assertEquals(Boolean.TRUE, formatter.isInitialized());
    }

}