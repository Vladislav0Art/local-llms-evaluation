package org.jsoup.nodes;

public class GeneratedOuterHtmlShouldReturnCorrectOutput {

    private static final String EMPTY_STRING = "";
    private static final String COMMENT_CONTENT = "<!-- This is a comment -->";
    private static final String XML_DECLARATION_DATA = "!XML Declaration Data!";
    private static final String XML_DECLARATION_FRAGMENT = "<!XML Declaration Data!>";
    private static final String INVALID_XML_DECLARATION_FRAGMENT = "<InvalidFragment>";

    @Test
    public void outerHtmlShouldReturnCorrectOutput() throws IOException {
        // given
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);

        // when
        Comment comment = new Comment(COMMENT_CONTENT);
        comment.outerHtmlHead(accum, 0, out);

        // then
        String expectedOutput = "<!--This is a comment-->";
        assertEquals(expectedOutput, accum.toString());
    }

}