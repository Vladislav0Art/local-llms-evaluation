package org.jsoup.helper;

public class GeneratedTestW3CDomContextNode {

    public enum NodeType {
        ELEMENT_NODE,
        TEXT_NODE
    }

    public Node contextNode(String xml) {
        return new ContextNode(xml);
    }

    public java.util.List<String> sourceNodes(java.util.List<String> nodeList, NodeType nodeType) {
        java.util.List<String> result = java.util.Collections.emptyList();
        for (String node : nodeList) {
            if (nodeType == NodeType.ELEMENT_NODE) {
                result.add(node);
            } else if (nodeType == NodeType.TEXT_NODE) {
                result.add("text");
            }
        }
        return result;
    }

    public class Node {
        private String value;

        public Node(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public class ContextNode extends Node {
        private String xml;

        public ContextNode(String xml) {
            super(xml);
            this.xml = xml;
        }
    }
}

public class W3CDomTest {

    @Test
    public void testW3CDomContextNode() {
        // Arrange
        String xml = "<html><body>Hello World!</body></html>";
        java.util.List<String> nodeList = java.util.Arrays.asList("body", "html");

        // Act
        W3CDom w3cdom = new W3CDom();
        ContextNode contextNode = w3cdom.contextNode(xml);

        // Assert
        assertEquals(xml, contextNode.toString());
    }

}