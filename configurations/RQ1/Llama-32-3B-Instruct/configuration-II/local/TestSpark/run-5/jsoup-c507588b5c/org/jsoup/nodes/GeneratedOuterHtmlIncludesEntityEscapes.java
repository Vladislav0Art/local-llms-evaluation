package org.jsoup.nodes;

public class GeneratedOuterHtmlIncludesEntityEscapes {

    @Test
    public void outerHtmlIncludesEntityEscapes() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        Appendable accum = htmlBuilder;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode node = new TextNode("Hello, &amp; World!");
        node.outerHtmlHead(accum, 0, out);
        assertTrue(htmlBuilder.toString().contains("&amp;"));
    }

}