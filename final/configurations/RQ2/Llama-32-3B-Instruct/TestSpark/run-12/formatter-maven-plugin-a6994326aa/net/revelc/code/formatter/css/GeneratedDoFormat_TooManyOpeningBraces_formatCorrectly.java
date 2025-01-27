package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class GeneratedDoFormat_TooManyOpeningBraces_formatCorrectly {

    @Mock
    private ConfigurationSource cfg;

    @Autowired
    private CssFormatter formatter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doFormat_TooManyOpeningBraces_formatCorrectly() throws Exception {
        String cssCode = "body { color: red; }";
        String expected = "body { color: red; }\n";

        Map<String, String> options = new java.util.HashMap<>();
        when(cfg.getOptions()).thenReturn(options);

        formatter.init(options, cfg);
        StringWriter output = new StringWriter();
        formatter.doFormat(cssCode + " {", LineEnding.LF).writeTo(output);
        String result = output.toString();

        assertEquals(expected, result);
    }

}