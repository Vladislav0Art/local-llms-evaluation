package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedTestFalse() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

    @Test
    public void doFormatWithNewLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body {background-color: #d0e4fe;}";
        String formattedCode = formatter.doFormat(code, LineEnding.NEWLINE);
        Assert.assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithCarriageReturnTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body {background-color: #d0e4fe;}";
        String formattedCode = formatter.doFormat(code, LineEnding.CARRIAGE_RETURN);
        Assert.assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithCRNLTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body {background-color: #d0e4fe;}";
        String formattedCode = formatter.doFormat(code, LineEnding.CRNL);
        Assert.assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        formatter.doFormat(null, LineEnding.NEWLINE);
    }

}