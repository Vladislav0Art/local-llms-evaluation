package org.jsoup.helper;

public class GeneratedNamespaceAware_OutputHtmlTest {

    @Test
    public void namespaceAware_OutputHtmlTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        // Given
        String[] properties = {"key1", "value1"};
        Properties props = new Properties();
        props.put("property1", "value1");
        doc.setProperty("property2", "value2");

        // When
        W3CDom.OutputHtml(doc, props);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_html"));
    }

}