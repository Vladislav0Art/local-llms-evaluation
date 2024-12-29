package org.jsoup.parser;

public class GeneratedTestPopStackToCloseWithoutBaseUri {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testPopStackToCloseWithoutBaseUri() throws Exception {
        // Arrange
        Token.EndTag endTag = document.createEndTag("a");

        // Act
        treeBuilder.popStackToClose(endTag);

        // Assert
        assertEquals("<b>", ((TreeNode) document.body()).outerHtml());
    }

}