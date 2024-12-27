package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedDoFormat_withoutIndent_returnException_test {

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
    public void doFormat_withoutIndent_returnException_test() {
        String code = "body { background-color: #fff; }";
        LineEnding.LineEndingType ending = LineEnding.LineEndingType.LF;
        assertThrows(FormatterException.class, () -> new CssFormatter().doFormat(code, ending));
    }

}