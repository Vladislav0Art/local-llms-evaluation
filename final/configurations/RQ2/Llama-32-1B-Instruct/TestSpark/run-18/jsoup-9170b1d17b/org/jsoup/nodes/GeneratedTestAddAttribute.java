package org.jsoup.nodes;

public class GeneratedTestAddAttribute {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testAddAttribute() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        add(attribute1);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

}