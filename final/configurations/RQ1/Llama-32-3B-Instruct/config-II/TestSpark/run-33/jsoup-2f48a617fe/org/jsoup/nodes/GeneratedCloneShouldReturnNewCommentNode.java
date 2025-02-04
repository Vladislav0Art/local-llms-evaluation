package org.jsoup.nodes;

public class GeneratedCloneShouldReturnNewCommentNode {

    private static final String EMPTY_STRING = "";
    private static final String COMMENT_CONTENT = "<!-- This is a comment -->";
    private static final String XML_DECLARATION_DATA = "!XML Declaration Data!";
    private static final String XML_DECLARATION_FRAGMENT = "<!XML Declaration Data!>";
    private static final String INVALID_XML_DECLARATION_FRAGMENT = "<InvalidFragment>";

    @Test
    public void cloneShouldReturnNewCommentNode() {
        Comment comment = new Comment(COMMENT_CONTENT);
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}