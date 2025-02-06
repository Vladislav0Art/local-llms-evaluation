package org.jsoup.nodes;

public class GeneratedCreateElementMethod_CreatesInstanceOfElementWithCorrectTagName {

    @Test
    public void createElementMethod_CreatesInstanceOfElementWithCorrectTagName() {
        Element element = Document.createElement("div");
        assertNotNull(element);
        assertTrue(element instanceof Element);
        assertEquals("div", ((Element) element).tagName());
    }

}