package org.jsoup.nodes;

public class GeneratedTestPutMultiple {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testPutMultiple() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        put(attribute1);

        String key2 = "testKey2";
        Attribute attribute2 = document.createAttribute(key2);
        attribute2.setText("testValue2");
        put(attribute2);

        assertEquals(2, getKeys().size());
    }

}