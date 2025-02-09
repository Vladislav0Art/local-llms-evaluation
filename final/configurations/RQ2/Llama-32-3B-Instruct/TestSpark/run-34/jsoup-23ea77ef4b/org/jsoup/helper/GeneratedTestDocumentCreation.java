package org.jsoup.helper;

public class GeneratedTestDocumentCreation {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testDocumentCreation() {
        Document document = new DOMBuilder().build("<root><child>Child content</child></root>");
        assertNotNull(document.getDocumentElement());
    }

}