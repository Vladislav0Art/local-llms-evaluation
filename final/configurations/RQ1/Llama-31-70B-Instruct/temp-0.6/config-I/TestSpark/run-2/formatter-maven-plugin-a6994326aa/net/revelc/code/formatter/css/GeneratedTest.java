package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTest {

    @Test
    public void initTest() throws IOException {
        // Arrange
        final var code = "some css code";
        final var options = new HashMap<String, String>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        final var formatter = new CssFormatter();

        // Act
        formatter.init(options, null);
        final var formattedCode = formatter.doFormat(code, null);

        // Assert
        assertEquals(formattedCode, code);
    }

}