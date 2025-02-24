package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatWithCodeAndEndingThrowExceptionTest {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatWithCodeAndEndingThrowExceptionTest() throws IOException {
        cssFormatter = new CssFormatter();
        String code = "some code";
        LineEnding ending = mock(LineEnding.class);

        cssFormatter.doFormat(code, ending);
    }

}