package org.jsoup.nodes;

public class GeneratedTest {

    private static final String EMPTY_STRING = "";
    private static final String COMMENT_CONTENT = "<!-- This is a comment -->";
    private static final String XML_DECLARATION_DATA = "!XML Declaration Data!";
    private static final String XML_DECLARATION_FRAGMENT = "<!XML Declaration Data!>";
    private static final String INVALID_XML_DECLARATION_FRAGMENT = "<InvalidFragment>";

    @Test
    public void newCommentNode_withEmptyData_shouldReturnEmptyString() {
        Comment comment = new Comment(EMPTY_STRING);
        assertEquals(EMPTY_STRING, comment.getData());
    }

    @Test
    public void newCommentNode_withNonEmptyData_shouldReturnNonEmptyString() {
        Comment comment = new Comment(COMMENT_CONTENT);
        assertEquals(COMMENT_CONTENT, comment.getData());
    }

    @Test
    public void isXmlDeclaration_withXmlDeclarationData_shouldReturnTrue() {
        Comment comment = new Comment(XML_DECLARATION_DATA);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_withoutXmlDeclarationData_shouldReturnFalse() {
        Comment comment = new Comment(COMMENT_CONTENT);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_withValidFragment_shouldReturnXmlDeclaration() throws Exception {
        // given
        Document document = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(XML_DECLARATION_FRAGMENT, baseUri());

        // when
        Comment comment = new Comment(COMMENT_CONTENT);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // then
        assertNotNull(xmlDeclaration);
    }

    @Test
    public void asXmlDeclaration_withInvalidFragment_shouldReturnNull() throws Exception {
        // given
        Document document = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(INVALID_XML_DECLARATION_FRAGMENT, baseUri());

        // when
        Comment comment = new Comment(COMMENT_CONTENT);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // then
        assertNull(xmlDeclaration);
    }

    @Test
    public void cloneShouldReturnNewCommentNode() {
        Comment comment = new Comment(COMMENT_CONTENT);
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

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