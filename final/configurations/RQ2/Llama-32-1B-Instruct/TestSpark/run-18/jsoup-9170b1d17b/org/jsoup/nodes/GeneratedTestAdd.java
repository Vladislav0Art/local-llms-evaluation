package org.jsoup.nodes;

public class GeneratedTestAdd {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testAdd() {
        String key = "testKey";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        add(attribute);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

}