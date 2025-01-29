package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCaseIgnoreCase {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testPutIgnoreCaseIgnoreCase() {
        String key = "TESTKEY";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        put(attribute);

        assertEquals(1, getKeys().size());

        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

}