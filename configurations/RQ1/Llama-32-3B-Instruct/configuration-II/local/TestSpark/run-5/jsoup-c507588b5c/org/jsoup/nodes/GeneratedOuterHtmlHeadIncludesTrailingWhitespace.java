package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIncludesTrailingWhitespace {

    @Test
    public void outerHtmlHeadIncludesTrailingWhitespace() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        Appendable accum = htmlBuilder;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode node = new TextNode("   ");
        node.outerHtmlHead(accum, 0, out);
        assertTrue(htmlBuilder.toString().contains("&nbsp;"));
    }

}