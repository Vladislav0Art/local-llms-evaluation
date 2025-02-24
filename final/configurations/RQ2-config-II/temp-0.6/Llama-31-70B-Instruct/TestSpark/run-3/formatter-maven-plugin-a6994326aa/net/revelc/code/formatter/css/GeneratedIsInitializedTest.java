package net.revelc.code.formatter.css;

public class GeneratedIsInitializedTest {

    private CssFormatter formatter;

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        boolean initialized = formatter.isInitialized();
        assertTrue(initialized);
    }

}