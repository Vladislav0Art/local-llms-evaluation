package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        String encodedText = "hello world";
        TextNode node = new TextNode(encodedText);
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.INDENT);
        assertEquals("  hello   world", new StringBuilder().append(node).toString());
    }

}