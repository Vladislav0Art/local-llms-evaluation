package org.jsoup.nodes;

public class GeneratedTestId {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testId() {
        String id = "testId";
        element.id(id);
        assertEquals(id, element.id());
    }

}