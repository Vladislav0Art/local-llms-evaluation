package org.jsoup.nodes;

public class GeneratedTestAttr {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testAttr() {
        String attributeKey = "testKey";
        String attributeValue = "testValue";
        element.attr(attributeKey, attributeValue);
        assertEquals(attributeValue, element.attr(attributeKey));
    }

}