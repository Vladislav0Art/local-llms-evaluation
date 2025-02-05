package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitEmptyOptionsTest {

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(new HashMap<>(), configurationSource);
    }

}