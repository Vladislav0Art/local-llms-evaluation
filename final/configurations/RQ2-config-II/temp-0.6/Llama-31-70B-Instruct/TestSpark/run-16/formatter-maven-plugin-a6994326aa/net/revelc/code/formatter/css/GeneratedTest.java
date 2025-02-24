package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {background-color: red;}";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertEquals("body {background-color: red;}\n", formattedCode);
    }

    @Test
    public void doFormatExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "";
        LineEnding ending = LineEnding.UNIX;
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, ending));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}