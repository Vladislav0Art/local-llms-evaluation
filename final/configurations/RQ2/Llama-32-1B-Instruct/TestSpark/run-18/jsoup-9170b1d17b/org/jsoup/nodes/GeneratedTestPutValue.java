package org.jsoup.nodes;

public class GeneratedTestPutValue {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testPutValue() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        add(attribute1);

        assertEquals(1, getKeys().size());

        assertEquals("testValue1", getKeyValues().get(0).getValue());
    }

}