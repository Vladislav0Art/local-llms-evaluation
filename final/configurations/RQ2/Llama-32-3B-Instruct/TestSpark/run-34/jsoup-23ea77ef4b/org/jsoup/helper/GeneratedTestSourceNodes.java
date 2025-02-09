package org.jsoup.helper;

public class GeneratedTestSourceNodes {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testSourceNodes() {
        NodeList nodeList = new DOMBuilder().build("<root><child>Child content</child></root>");
        List<org.jsoup.nodes.Node> result = DOMHelper.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals("Child", (String) result.get(1));
    }
}

}