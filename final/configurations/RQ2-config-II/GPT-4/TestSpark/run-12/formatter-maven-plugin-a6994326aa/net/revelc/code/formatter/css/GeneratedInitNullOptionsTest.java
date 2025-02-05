package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitNullOptionsTest {

    @Test
    public void initNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(null, configurationSource);
    }

}