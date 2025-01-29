package org.jsoup.nodes;

public class GeneratedTestAddMultiple {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testAddMultiple() {
        String key1 = "testKey1";
        String key2 = "testKey2";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        add(attribute1);

        String key3 = "testKey3";
        String key4 = "testKey4";

        Attribute attribute2 = document.createAttribute(key2);
        attribute2.setText("testValue2");
        add(attribute2);

        assertEquals(2, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

}