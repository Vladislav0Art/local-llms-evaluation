package org.jsoup.nodes;

public class GeneratedTestAddStringNotSupported {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testAddStringNotSupported() {
        String key = "test";
        Object value = "hello world";
        String result = (Object) attributes.add(key, value);
        assertNotNull(result);
    }

}