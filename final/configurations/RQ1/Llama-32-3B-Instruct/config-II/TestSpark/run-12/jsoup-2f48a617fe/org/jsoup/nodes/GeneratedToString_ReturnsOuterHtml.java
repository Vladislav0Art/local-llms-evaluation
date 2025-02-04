package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() {
        // given
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document();

        Comment comment = new Comment("This is a comment");

        // when
        String result = comment.toString();

        // then
        verify(accum).append("<!--").append(comment.getData()).append("-->");
    }

}