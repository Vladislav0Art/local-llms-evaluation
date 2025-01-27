package org.jsoup.helper;

public class GeneratedTestConvertToDocument {

    public static Document convertToDocument(String content) {
        Node node = new Node();
        node.setId("1");
        Document document = new Document();
        document.setContent(content);
        return document;
    }

    public static void selectXpath(List<String> xpaths, String contextNode) {
        for (String xpath : xpaths) {
            if (xpath.contains(contextNode)) {
                System.out.println(xpath);
            }
        }
    }

    @Test
    public void testConvertToDocument() {
        String content = "Hello World!";
        Document document = convertToDocument(content);
        assertEquals("Hello World!", document.getContent());
    }
}

public class NodeListTest {

    public static NodeList nodeList = new NodeList();

    public static void addNode(Node node) {
        nodeList.addNode(node);
    }

    public static String getNodes() {
        StringBuilder sb = new StringBuilder();
        for (Node node : nodeList.nodes) {
            sb.append(node.getId()).append(",");
        }
        return sb.toString().substring(0, sb.length() - 1); // remove last comma and space
    }
}

}