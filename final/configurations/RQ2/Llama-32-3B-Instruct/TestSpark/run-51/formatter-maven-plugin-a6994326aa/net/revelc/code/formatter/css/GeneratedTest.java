package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void init() {
        when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.init(Map.of(), cfg);
        assertEquals(false, result);
    }

    @Test
    public void doFormatSuccess() throws IOException {
        String input = "body { background-color: #f2f2f2; }";
        when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(input, LineEnding.LF);
        assertEquals("body { background-color: #f2f2f2; }", result);
    }

    @Test
    public void doFormatFailure() throws IOException {
        when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
        CssFormatter formatter = new CssFormatter();
        String input = "invalid css";
        try {
            formatter.doFormat(input, LineEnding.LF);
            assert false;
        } catch (IOException e) {
        }
    }

    @Test
    public void isInitialized() {
        when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.isInitialized();
        assertEquals(false, result);
    }
}

class LineEnding {
}

}