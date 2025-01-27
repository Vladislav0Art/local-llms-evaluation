package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedCssFormatterFormatStringWithInvalidValueIsError {

    @Test
    public void cssFormatterFormatStringWithInvalidValueIsError() throws IOException {
        String code = "color: invalid-value;";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending);
        assertThat(result, Is.is("ERROR: invalid value"));
    }

}