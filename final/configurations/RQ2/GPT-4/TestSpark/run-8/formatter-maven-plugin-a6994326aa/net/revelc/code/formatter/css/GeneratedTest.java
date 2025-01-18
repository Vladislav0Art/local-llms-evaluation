package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, cfg);

        // Assert here with some suitable verification
        // That will depend on what init method do
    }

    @Test
    public void doFormatGivenIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "some invalid css code";
        LineEnding ending = LineEnding.CRLF;

        cssFormatter.doFormat(code, ending);
    }

    @Test
    public void doFormatGivenValidCssCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "valid css code";
        LineEnding ending = LineEnding.CRLF;

        String result = cssFormatter.doFormat(code, ending);

        // Assert here with some suitable verification
        // That will depend on what this method do and return
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        boolean isInitialized = cssFormatter.isInitialized();

        // Assert here with some suitable verification
        // That will depend on what this method do and return
        assertNotNull(isInitialized);
    }

}