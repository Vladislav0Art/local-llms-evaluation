package net.revelc.code.formatter.css;

import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.LineEnding;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatWithInvalidCodeTest {

    @Test
    public void doFormatWithInvalidCodeTest() throws IOException {
        final String invalidCode = ".test{background-color }";
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(invalidCode, LineEnding.OLDMAC);
    }

}