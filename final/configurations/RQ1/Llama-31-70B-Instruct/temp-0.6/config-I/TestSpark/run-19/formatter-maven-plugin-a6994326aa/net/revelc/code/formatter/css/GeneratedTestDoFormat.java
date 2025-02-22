package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import com.steadystate.css.format.CSSFormat;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestDoFormat {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void testDoFormat() throws IOException {
        String code = "a {\n  color: red;\n
    }

}