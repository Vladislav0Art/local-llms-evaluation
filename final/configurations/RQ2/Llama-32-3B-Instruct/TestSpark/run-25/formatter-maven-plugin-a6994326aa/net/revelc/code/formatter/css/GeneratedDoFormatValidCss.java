package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.ByteArrayInputStream;

import com.steadystate.css.sac.InputSource;

public class GeneratedDoFormatValidCss {

    @Test
    public void doFormatValidCss() throws IOException {
        String cssCode = ".class {\n" +
                "  property: value;\n" +
                "}";
        CssFormatter formatter = new CssFormatter();
        assertEquals(cssCode, formatter.doFormat(cssCode, null));
    }

}