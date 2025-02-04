package org.jsoup.nodes;

public class GeneratedNewCommentNode_withEmptyData_shouldReturnEmptyString {

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

}