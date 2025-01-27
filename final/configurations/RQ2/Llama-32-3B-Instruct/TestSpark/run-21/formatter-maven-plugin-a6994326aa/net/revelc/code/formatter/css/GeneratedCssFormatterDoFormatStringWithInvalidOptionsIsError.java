package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedCssFormatterDoFormatStringWithInvalidOptionsIsError {

    @Test
    public void cssFormatterDoFormatStringWithInvalidOptionsIsError() throws IOException {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        Map<String, String> options = new HashMap<>();
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending, options);
        assertThat(result, Is.is("ERROR: invalid option"));
    }

}