package org.jsoup.nodes;

public class GeneratedTestPutValueMultiple {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testPutValueMultiple() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        add(attribute1);

        String key2 = "testKey2";
        Attribute attribute2 = document.createAttribute(key2);
        add(attribute2);

        assertEquals(2, getKeys().size());

        assertEquals("testValue1", getKeyValues().get(0).getValue());
    }

}