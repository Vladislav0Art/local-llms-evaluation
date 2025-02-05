package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.io.IOException;

public class GeneratedDoFormatIOExceptionTest {

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        formatter.doFormat(null, LineEnding.NEWLINE);
    }

}