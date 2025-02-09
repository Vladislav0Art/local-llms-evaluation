package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter testFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        testFormatter.init(new HashMap<String, String>(), cfg);
        String result = testFormatter.doFormat("css code", LineEnding.LF);
        Assert.assertNotNull(result);
    }

}