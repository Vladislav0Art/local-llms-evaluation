package org.jsoup.nodes;

public class GeneratedTestEnsureChildNodes {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testEnsureChildNodes() {
        assertTrue(element.ensureChildNodes().size() > 0);
    }

}