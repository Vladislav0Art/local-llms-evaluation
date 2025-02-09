package org.jsoup.helper;

public class GeneratedTestElementCreation {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testElementCreation() {
        Element el = new DOMBuilder().build("<root><child>Child content</child></root>");
        assertEquals("root", el.asElement().getAttribute("tagName"));
    }

}