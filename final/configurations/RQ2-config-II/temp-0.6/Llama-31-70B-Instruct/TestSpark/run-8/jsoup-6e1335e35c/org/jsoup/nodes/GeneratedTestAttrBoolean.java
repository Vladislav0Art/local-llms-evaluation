package org.jsoup.nodes;

public class GeneratedTestAttrBoolean {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testAttrBoolean() {
        String attributeKey = "testKey";
        element.attr(attributeKey, true);
        assertEquals("true", element.attr(attributeKey));
    }

}