package org.jsoup.nodes;

public class GeneratedTestGetUserDataNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testGetUserDataNotNull() {
        String key = "test";
        Object value = "hello world";
        Attribute attribute = new Attributes.Attribute();
        attribute.setValue(value);
        String result = (Object) attributes.getUserData(key);
        assertEquals(attribute.getValue(), result);
    }

}