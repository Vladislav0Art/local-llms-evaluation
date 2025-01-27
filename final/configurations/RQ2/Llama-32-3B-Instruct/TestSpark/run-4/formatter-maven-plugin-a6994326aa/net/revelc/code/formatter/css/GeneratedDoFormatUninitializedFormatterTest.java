package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatUninitializedFormatterTest {

    @Test
    public void doFormatUninitializedFormatterTest() throws Exception {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = mock(CssFormatter.class);
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getOptions()).thenReturn(options);
        when(formatter.init(any(), any())).thenThrow(IOException::new);
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected an exception to be thrown.";
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Formatter not initialized"));
        }
    }

}