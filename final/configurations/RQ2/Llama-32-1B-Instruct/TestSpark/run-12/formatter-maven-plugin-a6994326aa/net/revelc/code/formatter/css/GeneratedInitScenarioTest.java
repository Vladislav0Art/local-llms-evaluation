package net.revelc.code.formatter.css;

import net.revelc.code.formatter.CSSFormatter;

import java.io.IOException;

public class GeneratedInitScenarioTest {

    @Test
    public void initScenarioTest() {
        cssFormatter.init();
        assertEquals(0, cssFormatter.options.size());
        assertEquals(ConfigurationSource.class, CssFormatter.class.getProtectionDomain().getCodeSource().getLocation().getPath().split("/")[1]);
    }

}