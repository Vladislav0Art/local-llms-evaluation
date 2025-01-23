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
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat_NullCode_ThrowsNullPointerException {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat_NullCode_ThrowsNullPointerException() {
        LineEnding ending = new LineEnding() {
            @Override
            public String getLineEnding() {
                return "\n";
            }
        };
        when(formatter.doFormat(any(String.class), any(LineEnding.class))).thenThrow(new NullPointerException());
        assertThrows(NullPointerException.class, () -> formatter.doFormat(null, ending));
    }

}