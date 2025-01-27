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
public class GeneratedInitTest_nonEmptyOptions {

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
    public void initTest_nonEmptyOptions() throws IOException {
        options.put("test", "value");
        formatter.init(options, cfg);
    }

}