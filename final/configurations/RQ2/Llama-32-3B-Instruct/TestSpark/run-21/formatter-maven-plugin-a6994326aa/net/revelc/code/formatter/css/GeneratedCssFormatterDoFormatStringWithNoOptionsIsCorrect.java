package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedCssFormatterDoFormatStringWithNoOptionsIsCorrect {

    @Test
    public void cssFormatterDoFormatStringWithNoOptionsIsCorrect() throws IOException {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending);
        assertThat(result, Is.is("body { color: red; }"));
    }

}