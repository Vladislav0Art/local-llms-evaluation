package org.jsoup.nodes;

public class GeneratedTestHasKeyStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testHasKeyStringNotNull() {
        String key = "test";
        Object value = "hello world";
        Object result = (Object) attributes.hasKeyIgnoreCase(key);
        assertTrue(result);
    }

}