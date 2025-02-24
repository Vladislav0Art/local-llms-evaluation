package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormat_emptyCode_shouldReturnEmptyString {

    private CssFormatter cssFormatter;

    @Test
    public void doFormat_emptyCode_shouldReturnEmptyString() throws IOException {
        // Arrange
        String code = "";
        LineEnding ending = mock(LineEnding.class);

        // Act
        String result = cssFormatter.doFormat(code, ending);

        // Assert
        assertEquals("", result);
    }

}