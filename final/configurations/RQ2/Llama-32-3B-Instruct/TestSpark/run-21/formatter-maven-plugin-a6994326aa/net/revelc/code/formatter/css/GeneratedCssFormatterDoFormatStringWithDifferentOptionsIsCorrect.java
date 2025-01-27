package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedCssFormatterDoFormatStringWithDifferentOptionsIsCorrect {

    @Test
    public void cssFormatterDoFormatStringWithDifferentOptionsIsCorrect() throws IOException {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        Map<String, String> options = new HashMap<>();
        options.put("indent", "  ");
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending, options);
        assertThat(result, Is.is("    body { color: red; }\n"));
    }

}