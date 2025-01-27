package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedInit_ReturnsTrueWhenOptionsAreNotEmpty {

    @BeforeClass
    public static void setup() {
        // Initialize the formatter with a mock configuration source
        Mockito.when(CssFormatter.getInstance().getConfigurationSource()).thenReturn(new ConfigurationSource());
    }

    @Test
    public void init_ReturnsTrueWhenOptionsAreNotEmpty() throws IOException {
        Map<String, String> options = new HashMap<>();

        // Act and assert
        CssFormatter.getInstance().init(options, new ConfigurationSource());
    }

}