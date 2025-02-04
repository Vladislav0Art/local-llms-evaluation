package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsNotCalledWhenPrettyPrintIsFalse {

    @Test
    public void outerHtmlHeadIsNotCalledWhenPrettyPrintIsFalse() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("Comment Data");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, depth, out));
    }

}