package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AssertionTest {

    @Test
    public void outerHtmlHead_AssertionTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("<p>Hello World!</p>", accum.toString());
    }

}