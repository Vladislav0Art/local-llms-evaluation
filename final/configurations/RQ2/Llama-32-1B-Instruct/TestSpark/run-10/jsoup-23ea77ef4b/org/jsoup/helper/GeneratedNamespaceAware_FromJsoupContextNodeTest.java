package org.jsoup.helper;

public class GeneratedNamespaceAware_FromJsoupContextNodeTest {

    @Test
    public void namespaceAware_FromJsoupContextNodeTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key", "value");
        element.setAttribute("otherKey", "otherValue");

        // Given
        Node contextNode = new Document();
        contextNode.appendChild(element);

        // When
        W3CDom.contextNode(doc, contextNode);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

}