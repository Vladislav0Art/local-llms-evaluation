package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatNoOptionsTest {

    @Test
    public void doFormatNoOptionsTest() throws Exception {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected an exception to be thrown.";
        } catch (IOException e) {
            assertThat(e.getMessage(), is("No options provided for CSS formatter"));
        }
    }

}