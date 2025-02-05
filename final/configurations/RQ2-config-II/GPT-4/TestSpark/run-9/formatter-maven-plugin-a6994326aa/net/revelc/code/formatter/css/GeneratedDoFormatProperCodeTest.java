package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatProperCodeTest {

    @Test
    public void doFormatProperCodeTest() throws IOException {
        String code = "body{color:white;}";
        LineEnding ending = LineEnding.CRLF;
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

}