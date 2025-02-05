package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.io.IOException;

public class GeneratedDoFormatWithNewLineEndingTest {

    @Test
    public void doFormatWithNewLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body {background-color: #d0e4fe;}";
        String formattedCode = formatter.doFormat(code, LineEnding.NEWLINE);
        Assert.assertEquals(code, formattedCode);
    }

}