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

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Assert
        Assert.assertFalse(formatter.isInitialized());
    }

}