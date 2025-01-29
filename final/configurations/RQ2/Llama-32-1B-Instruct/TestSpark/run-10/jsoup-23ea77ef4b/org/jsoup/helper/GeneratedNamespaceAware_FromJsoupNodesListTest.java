package org.jsoup.helper;

public class GeneratedNamespaceAware_FromJsoupNodesListTest {

    @Test
    public void namespaceAware_FromJsoupNodesListTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element1 = new Document();
        element1.setAttribute("key", "value");
        element1.setAttribute("otherKey", "otherValue");

        org.jsoup.nodes.Element element2 = new Document();
        element2.setAttribute("key1", "value1");

        // Given
        NodeList nodeList = new NodeList();
        nodeList.add(element1);
        nodeList.add(element2);

        // When
        W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

}