package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {background-color: red;}";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertEquals("body {background-color: red;}\n", formattedCode);
    }

}