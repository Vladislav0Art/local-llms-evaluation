package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatReturnNullTest {

    @Test
    public void doFormatReturnNullTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body { color: #ffffff; }";

        Assert.assertNull(formatter.doFormat(code, net.revelc.code.formatter.LineEnding.AUTO));
    }

}