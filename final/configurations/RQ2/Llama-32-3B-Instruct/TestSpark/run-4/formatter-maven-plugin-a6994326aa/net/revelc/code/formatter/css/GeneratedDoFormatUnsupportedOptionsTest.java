package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatUnsupportedOptionsTest {

    @Test
    public void doFormatUnsupportedOptionsTest() throws Exception {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = Collections.singletonMap("invalid", "option");
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected an exception to be thrown.";
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Unsupported option for CSS: invalid"));
        }
    }

}