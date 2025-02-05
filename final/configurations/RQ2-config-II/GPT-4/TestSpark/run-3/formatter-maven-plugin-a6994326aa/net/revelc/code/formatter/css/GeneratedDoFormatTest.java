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

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);
        formatter.init(new HashMap<>(), configurationSource);
        String code = ".format {font-family: Arial; font-size: 12px;}";
        // Act
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);

        // Assert
        Assert.assertNotNull(formattedCode);
        Assert.assertEquals(".format { font-family: Arial; font-size: 12px; }", formattedCode);
    }

}