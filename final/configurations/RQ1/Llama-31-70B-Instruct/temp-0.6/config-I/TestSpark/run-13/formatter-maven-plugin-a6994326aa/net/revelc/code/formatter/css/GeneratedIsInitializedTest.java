package net.revelc.code.formatter.css;

public class GeneratedIsInitializedTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void isInitializedTest() {
        assertTrue(cssFormatter.isInitialized());
    }

}