package org.jsoup.helper;

public class GeneratedTestStringConversion {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testStringConversion() {
        Document document = new DOMBuilder().parseString("<root><child>Child content</child></root>");
        assertEquals("root", DOMHelper.asString(DOMHelper.contextNode(document)));
    }

}