package org.jsoup.helper;

public class GeneratedNamespaceAware_FromJsoup_MultipleKeysTest {

    @Test
    public void namespaceAware_FromJsoup_MultipleKeysTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key1", "value1");
        element.setAttribute("otherKey", "otherValue");

        // Given
        String[] properties = {"property1", "value1"};
        Properties props = new Properties();
        props.put("property2", "value2");

        // When
        W3CDom.fromJsoup(element, doc);
        W3CDom.OutputHtml(doc, props);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

}