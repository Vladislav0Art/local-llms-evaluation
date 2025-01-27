package org.jsoup.helper;

public class GeneratedTestSelectNodes {

    public static String asString(Node node) {
        return node.getNodeValue();
    }

    public static NodeList sourceNodes(NodeList nodeList, Class<? extends Node> className) {
        List<Node> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (className.isInstance(node)) {
                result.add((Node) node);
            }
        }
        return (NodeList) result.toArray(new Node[0]);
    }

    public static NodeList selectXpath(List<String> xpath, Node contextNode) throws XPathException {
        // implementation of selectXpath method
        return null;
    }

    public static String convertToDocument(String content) {
        // implementation of convertToDocument method
        return null;
    }
}

public class W3CTests {

    @Test
    public void testSelectNodes() {
        NodeList nodeList = new ArrayList<>(Arrays.asList(new Node("1"), new Node("2")));
        NodeList result = W3CDomHelper.sourceNodes(nodeList, Node.class);
        assertEquals(2, result.getLength());
    }

}