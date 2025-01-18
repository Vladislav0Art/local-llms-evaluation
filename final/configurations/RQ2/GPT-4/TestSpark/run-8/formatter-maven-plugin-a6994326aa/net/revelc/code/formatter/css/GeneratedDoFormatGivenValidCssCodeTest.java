package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatGivenValidCssCodeTest {

    @Test
    public void doFormatGivenValidCssCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "valid css code";
        LineEnding ending = LineEnding.CRLF;

        String result = cssFormatter.doFormat(code, ending);

        // Assert here with some suitable verification
        // That will depend on what this method do and return
    }

}