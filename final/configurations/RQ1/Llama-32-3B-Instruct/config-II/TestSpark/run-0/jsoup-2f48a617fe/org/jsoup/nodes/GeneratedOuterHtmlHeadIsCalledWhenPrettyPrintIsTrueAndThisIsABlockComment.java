package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsCalledWhenPrettyPrintIsTrueAndThisIsABlockComment {

    @Test
    public void outerHtmlHeadIsCalledWhenPrettyPrintIsTrueAndThisIsABlockComment() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Block Comment");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, depth, out));
    }

}