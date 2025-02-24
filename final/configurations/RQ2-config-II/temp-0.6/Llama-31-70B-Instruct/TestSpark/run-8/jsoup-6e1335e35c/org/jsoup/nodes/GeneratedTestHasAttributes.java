package org.jsoup.nodes;

public class GeneratedTestHasAttributes {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testHasAttributes() {
        assertTrue(element.hasAttributes());
    }

}