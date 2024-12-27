package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTest {

    String getOptionValue(String option);
}

public class MockConfigurationSource implements ConfigurationSource {
    @Override
    public String getOptionValue(String option) {
        return "";
    }
}

class CssFormatterTest {

    private ConfigurationSource cfg;

    public CssFormatterTest() {
        this.cfg = new MockConfigurationSource();
    }

    @Test
    public void init_withValidOptions_returnTrue_test() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "  ");
        boolean result = new CssFormatter().init(options, cfg);
        assertTrue(result);
    }

    @Test
    public void init_withInvalidOptions_throwException_test() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");
        assertThrows(FormatterException.class, () -> new CssFormatter().init(options, cfg));
    }

    @Test
    public void doFormat_withValidCode_returnExpectedOutput_test() {
        String code = "body { background-color: #fff; }";
        LineEnding.LineEndingType ending = LineEnding.LineEndingType.LF;
        boolean result = new CssFormatter().doFormat(code, ending);
        String expectedOutput = "  body { background-color: #fff; }\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void doFormat_withoutIndent_returnException_test() {
        String code = "body { background-color: #fff; }";
        LineEnding.LineEndingType ending = LineEnding.LineEndingType.LF;
        assertThrows(FormatterException.class, () -> new CssFormatter().doFormat(code, ending));
    }

    @Test
    public void doFormat_withLineBreak_returnExpectedOutput_test() {
        String code = "body {\n  background-color: #fff; }\n";
        LineEnding.LineEndingType ending = LineEnding.LineEndingType.CRLF;
        boolean result = new CssFormatter().doFormat(code, ending);
        String expectedOutput = "  body{\n    background-color: #fff;\n  }\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void isInitialized_returnTrue_test() {
        boolean result = new CssFormatter();
        assertTrue(result);
    }
}

public class LineEnding {
    public enum LineEndingType {
        LF, CRLF
    }

}