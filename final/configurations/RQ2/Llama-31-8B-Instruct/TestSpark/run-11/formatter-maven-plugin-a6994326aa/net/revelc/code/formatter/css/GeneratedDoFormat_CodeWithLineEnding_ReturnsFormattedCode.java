package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat_CodeWithLineEnding_ReturnsFormattedCode {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat_CodeWithLineEnding_ReturnsFormattedCode() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = new LineEnding();
        when(ending.getLineEnding()).thenReturn("\n");
        String result = formatter.doFormat(code, ending);
        assertEquals("body {\n" +
                "  background-color: #f2f2f2;\n" +
                "}", result);
    }

}