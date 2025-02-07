package org.jsoup.nodes;

public class GeneratedTestAddAllAttributesNullValue {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testAddAllAttributesNullValue() {
        String key = "test";
        Attribute attribute1 = new Attributes.Attribute();
        Attribute attribute2 = new Attributes.Attribute();
        this.attributes.addAll(attribute1, attribute2.getValue());
        assertEquals(0, attributes.size());
    }

}