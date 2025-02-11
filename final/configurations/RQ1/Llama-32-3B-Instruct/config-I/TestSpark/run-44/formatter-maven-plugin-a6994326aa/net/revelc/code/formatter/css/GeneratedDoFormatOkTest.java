package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatOkTest {

    @Test
    public void doFormatOkTest() throws IOException {
        String code = "body { background-color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        String formattedCode = formatter.doFormat(code, ending);
        assertThat(formattedCode, is(code));
    }

}