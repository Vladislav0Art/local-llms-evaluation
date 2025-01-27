package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized[]

Test {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private CSSFormat format;

    @Test
    public void isInitialized[] Test() {
        net.revelc.code.formatter.CssFormatter formatter = new net.revelc.code.formatter.CssFormatter(cfg);
        assertTrue(formatter.isInitialized());
    }

}