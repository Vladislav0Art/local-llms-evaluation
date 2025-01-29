package net.revelc.code.formatter.css;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() {
        boolean isInitialized = false;
        when(cfg.getConfigurationSource()).thenReturn(new ConfigurationSource());
        when(cssOMParser.parseCss(inputSource)).thenReturn(new CSSOMParser());
        when(sacParserCSS3.createStyleSheet()).thenReturn(new SACParserCSS3());
        when(cssFormat.createCssStylesheet()).thenReturn(new CssFormat());
        new CssFormatter().init(Map.of("cssVersion", "3"), cfg);
        assertEquals(true, isInitialized);
    }

}