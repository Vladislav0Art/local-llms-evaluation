package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import org.w3c.css.sac.InputSource;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsInitializedWithNullOptions {

    @Test
    public void testIsInitializedWithNullOptions() {
        InputSource source = new InputSource(new StringReader("body { background-color: #fff; }"));
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

}