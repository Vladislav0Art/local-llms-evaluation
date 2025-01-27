package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatNoErrorTest {

    @Test
    public void doFormatNoErrorTest() {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        String formatted = formatter.doFormat(code, ending);
        assertThat(formatted, is("body { color: red; }"));
    }

}