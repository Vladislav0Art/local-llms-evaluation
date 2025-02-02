package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadDepth {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void outerHtmlHeadDepth() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("   ");
        textNode.outerHtmlHead(writer, 1, document.outputSettings());
        assertEquals("\n", out.toString().trim());
    }

}