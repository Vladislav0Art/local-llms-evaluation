package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatGivenIOExceptionTest {

    @Test
    public void doFormatGivenIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "some invalid css code";
        LineEnding ending = LineEnding.CRLF;

        cssFormatter.doFormat(code, ending);
    }

}