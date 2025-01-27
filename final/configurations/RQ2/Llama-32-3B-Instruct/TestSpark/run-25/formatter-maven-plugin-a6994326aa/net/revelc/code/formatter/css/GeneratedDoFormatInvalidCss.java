package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.ByteArrayInputStream;

import com.steadystate.css.sac.InputSource;

public class GeneratedDoFormatInvalidCss {

    @Test
    public void doFormatInvalidCss() throws IOException {
        String cssCode = ".class {\n" +
                "  property: value" +
                "}";
        CssFormatter formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.doFormat(cssCode, null));
    }
}

}