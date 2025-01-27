package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat_InvalidInput ThrowsIOException {

    @BeforeClass
    public static void setup() {
        // Initialize mock objects here
    }

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    @Test
    public void doFormat_InvalidInput

    ThrowsIOException() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String cssCode = " invalid input";
        LineEnding lineEnding = LineEnding.LF;

        try {
            formatter.doFormat(cssCode, lineEnding);
            assert false;
        } catch (IOException e) {
            // expected
        }
    }

}