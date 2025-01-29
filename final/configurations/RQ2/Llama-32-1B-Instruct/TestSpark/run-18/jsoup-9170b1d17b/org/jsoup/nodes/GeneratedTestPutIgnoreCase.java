package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCase {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testPutIgnoreCase() {
        String key = "testKey";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        put(attribute);

        assertEquals(1, getKeys().size());

        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

}