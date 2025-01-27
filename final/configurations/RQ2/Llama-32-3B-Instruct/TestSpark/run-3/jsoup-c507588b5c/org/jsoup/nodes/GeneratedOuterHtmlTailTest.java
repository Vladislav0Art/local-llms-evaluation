package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("<p>test</p>");
        node.outerHtmlTail(accum, 0, out);
        assertTrue(accum.toString().contains("</p>"));
    }

}