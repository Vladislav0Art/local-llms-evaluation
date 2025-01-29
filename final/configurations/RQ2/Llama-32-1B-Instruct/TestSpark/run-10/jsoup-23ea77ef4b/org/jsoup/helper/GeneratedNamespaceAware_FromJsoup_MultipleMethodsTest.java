package org.jsoup.helper;

public class GeneratedNamespaceAware_FromJsoup_MultipleMethodsTest {

    @Test
    public void namespaceAware_FromJsoup_MultipleMethodsTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key", "value");
        element.setAttribute("otherKey", "otherValue");

        // Given
        String[] properties = {"property1", "value1"};
        Properties props = new Properties();
        props.put("property2", "value2");

        doc.setProperty("contextNode", element);
        W3CDom.sourceNodes(doc, org.jsoup.nodes.Node.class);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

}