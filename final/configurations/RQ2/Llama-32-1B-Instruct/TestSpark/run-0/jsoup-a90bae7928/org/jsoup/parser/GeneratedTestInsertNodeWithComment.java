package org.jsoup.parser;

public class GeneratedTestInsertNodeWithComment {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testInsertNodeWithComment() throws Exception {
        // Arrange
        Node node = document.createElement("p");
        document.appendChild(node);
        Comment commentToken = document.createComment("Hello, World!");
        node.appendChild(commentToken);

        Element element = (Element) treeBuilder.insertToken(node, "p");

        // Assert
        assertEquals("<p> Hello, World!</p>", ((TreeNode) element).outerHtml());
    }

}