package net.revelc.code.formatter.css;

import net.revelc.code.formatter.CSSFormatter;

import java.io.IOException;

public class GeneratedIsInitializedScenarioTest {

    @Test
    public void isInitializedScenarioTest() {
        CssFormatter formatter = new CSSFormatter();
        assertTrue(formatter.isInitialized());
    }

}