package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatNullInputTest {

    @Test
    public void doFormatNullInputTest() throws IOException {
        String code = null;
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        assertNotEquals(code, formatter.doFormat(code, ending));
    }

}