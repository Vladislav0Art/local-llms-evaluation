package net.revelc.code.formatter.css;

import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        // Assert
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        // Act
        formatter.init(new HashMap<>(), configurationSource);

        // Assert
        Assert.assertTrue(formatter.isInitialized());
    }

}