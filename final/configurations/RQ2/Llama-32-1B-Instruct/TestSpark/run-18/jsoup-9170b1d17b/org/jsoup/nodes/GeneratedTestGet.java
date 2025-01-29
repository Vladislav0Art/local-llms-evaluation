package org.jsoup.nodes;

public class GeneratedTestGet {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testGet() {
        String key = "testKey";
        String expectedValue = "testValue";
        Attribute attribute = document.createAttribute(key);
        attribute.setText(expectedValue);

        assertEquals(expectedValue, get(key));
    }

}