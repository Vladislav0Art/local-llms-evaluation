package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.select.Elements;

public class GeneratedNodeName_NullString {

    public static String nodeName(String commentText) {
        return commentText == null ? "Comment" : commentText.nodeName();
    }

    public static String getNodeName(Comment comment) {
        return comment.getNodeName();
    }

    @Test
    public void nodeName_NullString() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = null;
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("Comment", nodeName(commentText));
    }

}