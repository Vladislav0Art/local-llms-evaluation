package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseStringNotSupported {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testGetIgnoreCaseStringNotSupported() {
        String key = "test";
        Object value = "hello world";
        String result = (String) attributes.getIgnoreCase(key);
        assertNotNull(result);
    }

}