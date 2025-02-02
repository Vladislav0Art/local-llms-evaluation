package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_commentWithPrettyPrint_isIndented {

    @Test
    public void outerHtmlHead_commentWithPrettyPrint_isIndented() {
        // given
        String data = "This is a valid comment";
        Comment comment = new Comment(data);

        // when
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment outerHtmlHeadComment = new Comment("#comment").outerHtmlHead(accum, depth, out);

        // then
        assertTrue(accum.toString().contains("\n"));
    }

}