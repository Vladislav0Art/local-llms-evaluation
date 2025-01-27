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
public class GeneratedTestDoFormatWithEmptyCode {

    CssFormatter .class,CSSOMParser .class,SACParserCSS3 .class
})

public class CssFormatterTest {

    @Mock
    private ConfigurationSource cfg;

    @Mocked
    private Map<String, String> options;

    @Mocked
    private CSSStyleSheetImpl cssStyleSheetImpl;

    public static final CssFormatter FORMATTER = new CssFormatter();

    public static final LineEnding LINE_ENDING_LF = new LineEnding(LF);
    public static final LineEnding LINE_ENDING_CRLF = new LineEnding(CRLF);

    public CssFormatterTest() {
        // No-arg constructor
    }

    @Mocked
    private CSSFormat cssFormat;

    @Test
    public void testDoFormatWithEmptyCode() throws IOException {
        String result = FORMATTER.doFormat("", LINE_ENDING_LF);
        assert !result.isEmpty();
    }

}