package org.jsoup.nodes;

public class GeneratedNewCommentNode_withNonEmptyData_shouldReturnNonEmptyString {

    private static final String EMPTY_STRING = "";
    private static final String COMMENT_CONTENT = "<!-- This is a comment -->";
    private static final String XML_DECLARATION_DATA = "!XML Declaration Data!";
    private static final String XML_DECLARATION_FRAGMENT = "<!XML Declaration Data!>";
    private static final String INVALID_XML_DECLARATION_FRAGMENT = "<InvalidFragment>";

    @Test
    public void newCommentNode_withNonEmptyData_shouldReturnNonEmptyString() {
        Comment comment = new Comment(COMMENT_CONTENT);
        assertEquals(COMMENT_CONTENT, comment.getData());
    }

}