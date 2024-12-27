package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedDoFormat_withLineBreak_returnExpectedOutput_test {

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
    public void doFormat_withLineBreak_returnExpectedOutput_test() {
        String code = "body {\n  background-color: #fff; }\n";
        LineEnding.LineEndingType ending = LineEnding.LineEndingType.CRLF;
        boolean result = new CssFormatter().doFormat(code, ending);
        String expectedOutput = "  body{\n    background-color: #fff;\n  }\n";
        assertEquals(expectedOutput, result);
    }

}