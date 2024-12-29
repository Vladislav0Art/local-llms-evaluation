package org.jsoup.parser;

public class GeneratedTestPopStackToClose {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testPopStackToClose() throws Exception {
        // Arrange
        Token.EndTag endTag = document.createEndTag("a");

        Element element = (Element) treeBuilder.insertToken(document, "b");
        treeBuilder.popStackToClose(endTag);

        // Assert
        assertEquals("<b>", ((TreeNode) element).outerHtml());
    }

}