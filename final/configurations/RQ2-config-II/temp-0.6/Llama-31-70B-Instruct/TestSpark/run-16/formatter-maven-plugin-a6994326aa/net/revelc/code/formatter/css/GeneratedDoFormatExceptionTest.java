package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatExceptionTest {

    @Test
    public void doFormatExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "";
        LineEnding ending = LineEnding.UNIX;
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, ending));
    }

}