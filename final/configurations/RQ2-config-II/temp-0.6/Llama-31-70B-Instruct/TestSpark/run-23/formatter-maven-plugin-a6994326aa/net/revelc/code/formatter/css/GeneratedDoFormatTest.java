package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatTest {

    @Mock
    private Map<String, String> mockOptions;

    @Mock
    private ConfigurationSource mockCfg;

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body { background-color: red; }";
        LineEnding lineEnding = LineEnding.UNIX;
        String expectedResult = "body {\n    background-color: red;\n}";
        String actualResult = cssFormatter.doFormat(code, lineEnding);
        assertEquals(expectedResult, actualResult);
    }

}