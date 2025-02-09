package org.jsoup.helper;

public class GeneratedTestContextNode {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testContextNode() {
        Document document = new DOMBuilder().parseString("<root><child>Child content</child></root>");
        Element context = DOMHelper.contextNode(document);
        assertEquals("root", context.asElement().getAttribute("tagName"));
    }
}

}