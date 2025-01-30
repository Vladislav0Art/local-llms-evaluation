package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatNullCodeTest {

    @Test
    public void doFormatNullCodeTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));

        formatter.doFormat(null, net.revelc.code.formatter.LineEnding.AUTO);
    }

}