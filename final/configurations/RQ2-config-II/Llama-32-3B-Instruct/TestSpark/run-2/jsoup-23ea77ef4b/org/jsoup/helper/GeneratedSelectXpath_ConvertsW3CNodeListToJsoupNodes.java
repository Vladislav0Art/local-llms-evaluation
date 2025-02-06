package org.jsoup.helper;

public class GeneratedSelectXpath_ConvertsW3CNodeListToJsoupNodes {

    @Test
    public void selectXpath_ConvertsW3CNodeListToJsoupNodes() {
        // arrange
        NodeList nodeList = new org.w3c.dom.NodeList();
        Class<T> nodeType = Class.forName("org.jsoup.nodes.Node");

        // act
        List<Node> result = W3CDom.sourceNodes(nodeList, nodeType);

        // assert
        assertTrue(result.isEmpty());
    }

}