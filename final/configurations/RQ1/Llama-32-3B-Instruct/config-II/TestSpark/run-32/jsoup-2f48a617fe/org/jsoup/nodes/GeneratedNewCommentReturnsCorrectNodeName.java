package org.jsoup.nodes;

public class GeneratedNewCommentReturnsCorrectNodeName {

    @Test
    public void newCommentReturnsCorrectNodeName() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("#comment", comment.nodeName());
    }

}