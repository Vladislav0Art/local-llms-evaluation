package org.jsoup.nodes;

public class GeneratedTestHasChildNodes {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testHasChildNodes() {
        assertTrue(element.hasChildNodes());
    }

}