package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatReturnModifiedTest {

    @Test
    public void doFormatReturnModifiedTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body { color: #ffffff\t; }";

        Assert.assertEquals("body { color: #ffffff\\9; }", formatter.doFormat(code, net.revelc.code.formatter.LineEnding.AUTO));
    }

}