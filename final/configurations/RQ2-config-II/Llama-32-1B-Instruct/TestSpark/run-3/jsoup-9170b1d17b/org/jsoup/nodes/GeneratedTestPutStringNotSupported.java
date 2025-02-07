package org.jsoup.nodes;

public class GeneratedTestPutStringNotSupported {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testPutStringNotSupported() {
        String key = "test";
        Object value = "hello world";
        Object result = (Object) attributes.put(key, value);
        assertNotNull(result);
    }

}