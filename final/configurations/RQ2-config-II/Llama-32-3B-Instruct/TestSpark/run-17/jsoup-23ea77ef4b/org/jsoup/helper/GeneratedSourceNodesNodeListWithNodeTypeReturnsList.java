package org.jsoup.helper;

public class GeneratedSourceNodesNodeListWithNodeTypeReturnsList {

    @Test
    public void sourceNodesNodeListWithNodeTypeReturnsList() {
        NodeList nodeList = new NodeList();
        List<Node> list = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(list.size() == 1);
    }

}