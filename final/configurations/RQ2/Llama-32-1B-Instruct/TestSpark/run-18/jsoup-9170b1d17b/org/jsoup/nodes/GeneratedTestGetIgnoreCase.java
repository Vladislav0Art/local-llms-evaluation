package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetIgnoreCase() {
        String key = "testKey";
        String expectedValue = "testValue";
        Attribute attribute = document.createAttribute(key);
        attribute.setText(expectedValue);

        assertEquals(expectedValue, getIgnoreCase(key));
    }

}