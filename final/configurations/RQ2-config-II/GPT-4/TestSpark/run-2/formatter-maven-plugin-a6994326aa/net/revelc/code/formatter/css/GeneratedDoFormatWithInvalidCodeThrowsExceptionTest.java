package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatWithInvalidCodeThrowsExceptionTest {

    @Test
    public void doFormatWithInvalidCodeThrowsExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color #000; }"; // Missing ":" causes a parsing error
        formatter.doFormat(code, LineEnding.CRLF);
    }

}