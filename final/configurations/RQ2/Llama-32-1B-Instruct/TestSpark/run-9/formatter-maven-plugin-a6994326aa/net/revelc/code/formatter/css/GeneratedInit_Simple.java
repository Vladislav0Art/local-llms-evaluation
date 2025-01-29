package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedInit_Simple {

    @Test
    public void init_Simple() {
        cssGenerator = new CssGenerator();
        getConfigurationSource().setOptions(Collections.singletonMap("format", "css"));
        when(mockInputSource.getCharacterData()).thenReturn("body { background-color: #f2f2f2; }");
        CssFormatter formatter = new CssFormatter(cssGenerator, getConfigurationSource());
        assert formatter.init() : "init failed";
    }

}