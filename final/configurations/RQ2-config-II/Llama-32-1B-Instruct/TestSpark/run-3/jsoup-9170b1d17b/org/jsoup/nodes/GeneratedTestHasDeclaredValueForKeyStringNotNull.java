package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testHasDeclaredValueForKeyStringNotNull() {
        String key = "test";
        Object value = "hello world";
        Object result = (Object) attributes.hasDeclaredValueForKey(key);
        assertTrue(result);
    }

}