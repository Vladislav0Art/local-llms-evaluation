package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWithLeadingWhitespace {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void outerHtmlHeadWithLeadingWhitespace() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("   ");
        textNode.outerHtmlHead(writer, 0, document.outputSettings());
        assertEquals("\n", out.toString().trim());
    }

}