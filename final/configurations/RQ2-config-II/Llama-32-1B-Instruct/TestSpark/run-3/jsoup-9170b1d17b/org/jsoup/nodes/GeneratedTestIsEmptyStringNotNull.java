package org.jsoup.nodes;

public class GeneratedTestIsEmptyStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testIsEmptyStringNotNull() {
        String key = "test";
        Object value = null;
        Object result = (boolean) attributes.isEmpty();
        assertTrue(result);
    }

}