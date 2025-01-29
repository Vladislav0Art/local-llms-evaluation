package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private LeafNode leafNode;

    @Before
    public void setup() throws IOException {
        Document document = new Document();
        Appendable appendable = document.append("Hello World!");
        leafNode = TextNode.createFromEncoded(toString(appendable));
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder appendableBuilder = new StringBuilder();
        outerHtmlHead(appendableBuilder, 1, Document.OutputSettings.FORWARD);
        assertEquals("<html><head></head>", toString(appendableBuilder.toString()));
    }

}