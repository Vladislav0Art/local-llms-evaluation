package org.jsoup.nodes;

public class GeneratedTestPutStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testPutStringNotNull() {
        String key = "test";
        String value = "hello world";
        Attribute attribute = new Attributes.Attribute();
        attribute.setValue(value);
        Object result = (Object) attributes.put(key, attribute.getValue());
        assertEquals(attribute.getValue(), result);
    }

}