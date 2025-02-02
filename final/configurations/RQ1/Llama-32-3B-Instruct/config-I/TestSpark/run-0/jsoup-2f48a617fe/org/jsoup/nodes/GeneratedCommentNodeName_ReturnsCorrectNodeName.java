package org.jsoup.nodes;

public class GeneratedCommentNodeName_ReturnsCorrectNodeName {

    @Test
    public void CommentNodeName_ReturnsCorrectNodeName() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}