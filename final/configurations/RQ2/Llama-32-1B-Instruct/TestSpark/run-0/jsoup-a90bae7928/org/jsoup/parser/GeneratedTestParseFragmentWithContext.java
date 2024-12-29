package org.jsoup.parser;

public class GeneratedTestParseFragmentWithContext {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testParseFragmentWithContext() throws Exception {
        // Arrange
        String inputFragment = "<xml><root><a>test</a></root></xml>";
        Element context = document.createElement("doc");

        // Act
        List<Node> listNodes = new ArrayList<>();
        treeBuilder.parseFragment(inputFragment, context, null);
        for (Node node : listNodes) {
            context.appendChild(node);
        }

        // Assert
        assertEquals("<root><a>test</a></root>", document.outerHtml());
    }

}