package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private LeafNode leafNode;

    @Before
    public void setup() throws IOException {
        Document document = new Document();
        Appendable appendable = document.append("Hello World!");
        leafNode = TextNode.createFromEncoded(toString(appendable));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        StringBuilder appendableBuilder = new StringBuilder();
        outerHtmlTail(appendableBuilder, 1, Document.OutputSettings.FORWARD);
        assertEquals("<html><head></head></body></html>", toString(appendableBuilder.toString()));
    }

}