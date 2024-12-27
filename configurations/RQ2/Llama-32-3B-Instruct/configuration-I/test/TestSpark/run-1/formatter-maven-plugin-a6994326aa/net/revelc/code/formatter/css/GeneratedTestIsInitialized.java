package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInitialized {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void testIsInitialized() {
        // given
        // no-op
        // then
        assertTrue(true);
    }
}

public class CssFormatter {

    private ConfigurationSource cfg;

    public void init(Map<String, String> options, ConfigurationSource cfg) {
        this.cfg = cfg;
    }

    public String doFormat(String code, LineEnding ending) throws IOException {
        return "";
    }

    public void doFormat_testBlankLines(String code, LineEnding ending) throws IOException {
        // given
        // when
        // then
    }

    public void doFormat_testMultipleLines(String code, LineEnding ending) throws IOException {
        // given
        // when
        // then
    }

    public void doFormat_testIOException(String code, LineEnding ending) throws IOException {
        // given
        // when
        // then
    }

    public boolean isInitialized() {
        return true;
    }
}

public class ConfigurationSource {
}

}