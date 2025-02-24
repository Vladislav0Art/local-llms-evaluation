package org.jsoup.nodes;

public class GeneratedTestIsBlock {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testIsBlock() {
        element.tagName("div");
        assertTrue(element.isBlock());
    }

}