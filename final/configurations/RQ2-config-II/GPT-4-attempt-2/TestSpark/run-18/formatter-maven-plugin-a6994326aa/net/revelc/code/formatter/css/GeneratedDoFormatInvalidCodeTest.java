package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatInvalidCodeTest {

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource source = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();
        formatter.init(options, source);
        formatter.doFormat(".classname { margin: 5px;", LineEnding.DEFAULT);
    }

}