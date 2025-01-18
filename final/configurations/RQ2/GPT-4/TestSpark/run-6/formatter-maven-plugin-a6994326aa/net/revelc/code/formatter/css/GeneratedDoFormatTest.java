package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);

        String formattedCode = formatter.doFormat(".intro { font-size: 20px; }", LineEnding.CRLF);

        Assert.assertEquals(".intro { font-size: 20px; }\r\n", formattedCode);
    }

}