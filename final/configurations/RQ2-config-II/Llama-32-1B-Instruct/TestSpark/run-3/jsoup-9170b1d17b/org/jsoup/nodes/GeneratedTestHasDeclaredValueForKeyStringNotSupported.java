package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyStringNotSupported {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testHasDeclaredValueForKeyStringNotSupported() {
        String key = "test";
        Object value = "hello world";
        Object result = (Object) attributes.hasDeclaredValueForKeyIgnoreCase(key);
        assertNotNull(result);
    }

}