package org.jsoup.nodes;

public class GeneratedTestAddAttributesNullValue {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testAddAttributesNullValue() {
        String key = "test";
        Attribute attribute1 = new Attributes.Attribute();
        Attribute attribute2 = new Attributes.Attribute();
        this.attributes.add(attribute1, attribute2.getValue());
        assertEquals(0, attributes.size());
    }

}