package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.io.StringReader;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.css.ConfigurationSource;
import net.revelc.code.formatter.lineending.LineEnding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedIsInitialized_toBoolean {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private LineEnding lineEnding;

    @Mock
    private CSSStyleSheetImpl cssStyleSheetImpl;

    private CssFormatter formatter;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        formatter = new CssFormatter(cfg, cssOMParser, cssStyleSheetImpl);
    }

    public void setLineEnding(LineEnding lineEnding) {
        this.lineEnding = lineEnding;
    }

    public void setCssOMParser(CSSOMParser cssOMParser) {
        this.cssOMParser = cssOMParser;
    }

    public void setCssStyleSheetImpl(CSSStyleSheetImpl cssStyleSheetImpl) {
        this.cssStyleSheetImpl = cssStyleSheetImpl;
    }

    @Test
    public void isInitialized_toBoolean() {
        assertTrue(formatter.isInitialized());
    }

    private static class CSSOMParser {
    }

    private static class CSSStyleSheetImpl {
    }

}