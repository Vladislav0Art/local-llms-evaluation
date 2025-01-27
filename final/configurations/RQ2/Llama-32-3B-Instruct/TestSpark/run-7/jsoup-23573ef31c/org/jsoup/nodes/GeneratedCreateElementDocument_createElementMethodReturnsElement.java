package org.jsoup.nodes;

public class GeneratedCreateElementDocument_createElementMethodReturnsElement {

    @Test
    public void createElementDocument_createElementMethodReturnsElement() {
        String expectedTagName = "html";
        Element expectedElement = mock(Element.class);
        when(expectedElement.toString()).thenReturn("<html></html>");
        Document document = new Document("");
        assertEquals(expectedElement, document.createElement(expectedTagName));
    }

}