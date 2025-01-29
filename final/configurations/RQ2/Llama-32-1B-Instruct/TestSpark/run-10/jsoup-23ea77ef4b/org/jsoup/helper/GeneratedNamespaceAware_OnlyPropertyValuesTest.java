package org.jsoup.helper;

public class GeneratedNamespaceAware_OnlyPropertyValuesTest {

    @Test
    public void namespaceAware_OnlyPropertyValuesTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        org.jsoup.nodes.Element element = new Document();
        element.setAttribute("key", "value");
        element.setAttribute("otherKey", "otherValue");

        // Given
        String[] properties = {"property1", "value1"};
        Properties props = new Properties();

        // When
        W3CDom.OutputXml(doc, props);

        // Then
        Assert.assertTrue(doc.getDocumentElement().getNodeName().contains("_xml"));
    }

}