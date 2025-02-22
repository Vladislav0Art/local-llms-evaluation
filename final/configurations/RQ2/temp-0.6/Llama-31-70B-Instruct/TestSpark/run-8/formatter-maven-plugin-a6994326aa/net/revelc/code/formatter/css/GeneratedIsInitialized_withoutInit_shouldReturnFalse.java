package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_withoutInit_shouldReturnFalse {

    private CssFormatter cssFormatter;

    @BeforeEach
    void init() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void isInitialized_withoutInit_shouldReturnFalse() {
        assertFalse(cssFormatter.isInitialized());
    }
}

class AbstractCacheableFormatterTest {
    private AbstractCacheableFormatter abstractCacheableFormatter;

    @BeforeEach
    void init() {
        abstractCacheableFormatter = new AbstractCacheableFormatter();
    }

}