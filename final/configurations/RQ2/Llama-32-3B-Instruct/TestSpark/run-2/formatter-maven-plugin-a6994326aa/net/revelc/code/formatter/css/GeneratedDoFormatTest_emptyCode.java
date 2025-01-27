package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockingbird.MockingBean;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.util.Map;

@RunWith(PowerMockRunner.class)
public class GeneratedDoFormatTest_emptyCode {

    CssFormatter .class,CSSOMParser .class,SACParserCSS3 .class
})

public class CssFormatterTest {

    @Mock
    private ConfigurationSource cfg;

    @Mocked
    private Map<String, String> options;

    private CssFormatter formatter;

    public CssFormatter() {
        this.formatter = new CssFormatter();
    }

    @Mocked
    private CSSStyleSheetImpl cssStyleSheetImpl;

    @Test
    public void doFormatTest_emptyCode() throws IOException {
        String result = formatter.doFormat("", LineEnding.LF);
        assert result.isEmpty();
    }

}