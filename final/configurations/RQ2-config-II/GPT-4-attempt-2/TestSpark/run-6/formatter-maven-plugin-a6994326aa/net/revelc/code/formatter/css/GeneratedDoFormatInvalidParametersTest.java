package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatInvalidParametersTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatInvalidParametersTest() throws IOException {
        String code = "invalid css code";
        LineEnding ending = LineEnding.CRLF;
        formatter.doFormat(code, ending);
    }

}