package org.jsoup.nodes;

public class GeneratedTestTagName {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testTagName() {
        String tagName = "testTagName";
        element.tagName(tagName);
        assertEquals(tagName, element.tagName());
    }

}