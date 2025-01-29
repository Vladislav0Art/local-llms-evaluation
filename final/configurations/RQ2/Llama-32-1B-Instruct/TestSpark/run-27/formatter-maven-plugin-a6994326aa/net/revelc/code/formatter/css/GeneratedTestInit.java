package net.revelc.code.formatter.css;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        when(cfg.getConfigurationSource()).thenReturn(new ConfigurationSource());
        new CssFormatter().init(Map.of("cssVersion", "3"), cfg);
    }

}