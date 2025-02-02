package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Document doc = new Document(new ParseSettings().prettyPrint(true));
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- Hello World! -->");
        comment.outerHtmlTail(accum, 0, doc.getOutputSettings());
        assertEquals("", accum.toString());
    }

}