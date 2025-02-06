package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_AssertionTest {

    @Test
    public void outerHtmlTail_AssertionTest() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}