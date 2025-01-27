package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatErrorTest {

    @Test
    public void doFormatErrorTest() {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.CRLF;
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected an IOException to be thrown.";
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Unsupported line ending for CSS"));
        }
    }

}