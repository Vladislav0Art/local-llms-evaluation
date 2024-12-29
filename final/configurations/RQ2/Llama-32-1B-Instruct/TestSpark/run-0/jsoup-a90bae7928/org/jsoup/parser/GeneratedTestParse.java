package org.jsoup.parser;

public class GeneratedTestParse {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testParse() throws Exception {
        // Arrange
        String inputFragment = "<xml><root><a>test</a></root></xml>";
        String baseUri = "";

        // Act
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document xmlDocument = treeBuilder.parse(inputFragment, baseUri);

        // Assert
        assertEquals("<root><a>test</a></root>", xmlDocument.outerHtml());
    }

}