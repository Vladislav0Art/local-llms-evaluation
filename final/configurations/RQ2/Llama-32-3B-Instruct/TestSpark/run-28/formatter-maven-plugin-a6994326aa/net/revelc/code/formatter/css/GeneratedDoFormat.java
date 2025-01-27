package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat {

    @Mock
    private ConfigurationSource cfg;

    public CssFormatter testConfigurationSource() {
        return new CssFormatter();
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doFormat() throws Exception {
        final String code = "body { background-color: #f2f2f2; }";
        final LineEnding ending = LineEnding.LF;

        when(cfg.getOptions()).thenReturn(code);

        CssFormatter formatter = testConfigurationSource();

        String result = formatter.doFormat(ending);

        assertEquals(code.replace("\n", "    "), result);
    }

}