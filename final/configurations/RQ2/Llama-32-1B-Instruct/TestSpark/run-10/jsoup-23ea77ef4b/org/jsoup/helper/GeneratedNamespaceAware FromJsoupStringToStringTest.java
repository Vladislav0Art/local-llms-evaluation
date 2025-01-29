package org.jsoup.helper;

public class GeneratedNamespaceAware FromJsoupStringToStringTest {

    @Test
    public void namespaceAware

    FromJsoupStringToStringTest() throws Exception {
        org.jsoup.nodes.Document doc = new Document();

        String documentString = "<root><element1>value1</element1></root>";

        // Given
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        String htmlString = transformer.transform(new InputSource(new java.io.StringReader(documentString)), new javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder())
                .getOutput().toString();

        // When
        W3CDom.OutputHtml(doc, null);

        // Then
        Assert.assertTrue(htmlString.contains("<html><body>"));
    }

}