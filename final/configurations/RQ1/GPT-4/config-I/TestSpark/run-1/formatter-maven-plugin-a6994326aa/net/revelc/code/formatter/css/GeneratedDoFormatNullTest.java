package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedDoFormatNullTest {

    @Test
    public void doFormatNullTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        String code = "body {\n\tbackground-color: #fff;\n}";

        Assert.assertNull(cssFormatter.doFormat(code, LineEnding.AUTO));
    }

}