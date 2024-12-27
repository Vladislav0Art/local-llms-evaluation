package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedInit_withValidOptions_returnTrue_test {

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

}