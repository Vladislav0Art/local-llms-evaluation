package org.jsoup.parser;

public class GeneratedTestInsertNode {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testInsertNode() throws Exception {
        // Arrange
        Node node = document.createElement("b");
        node.appendChild(document.createTextNode("Hello"));
        document.appendChild(node);

        Element element = (Element) treeBuilder.insertToken(node, "b");

        // Assert
        assertEquals("<b>Hello</b>", ((TreeNode) element).outerHtml());
    }

}