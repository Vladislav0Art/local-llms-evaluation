package org.jsoup.nodes;

public class GeneratedCreateElement_test {

    @Test
    public void createElement_test() {
        String tagName = "input";
        Element element = mock(Element.class);
        when(element.tagName()).thenReturn(tagName);
        Document document = new Document("http://example.com");
        Element createdElement = document.createElement(tagName);
        assertNotNull(createdElement);
        assertEquals(tagName, createdElement.nodeName());
    }

}