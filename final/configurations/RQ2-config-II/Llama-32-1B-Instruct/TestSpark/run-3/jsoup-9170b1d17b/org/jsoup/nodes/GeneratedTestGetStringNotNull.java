package org.jsoup.nodes;

public class GeneratedTestGetStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testGetStringNotNull() {
        String key = "test";
        String value = "hello world";
        String result = (String) attributes.get(key);
        assertEquals(value, result);
    }

}