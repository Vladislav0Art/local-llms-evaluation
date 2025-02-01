package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedDoFormatPositiveTest {

    @Test
    public void doFormatPositiveTest() throws Exception {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        ConfigurationSource configSource = mock(ConfigurationSource.class);
        formatter.init(options, configSource);

        String actualResult = formatter.doFormat("body{background-color:black;}", LineEnding.CR);
        Assert.assertNotNull(actualResult);
    }

}