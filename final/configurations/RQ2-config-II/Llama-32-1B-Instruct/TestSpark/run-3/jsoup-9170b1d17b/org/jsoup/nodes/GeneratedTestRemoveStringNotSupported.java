package org.jsoup.nodes;

public class GeneratedTestRemoveStringNotSupported {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testRemoveStringNotSupported() {
        String key = "test";
        Object value = "hello world";
        String result = (Object) attributes.remove(key);
        assertNotNull(result);
    }

}