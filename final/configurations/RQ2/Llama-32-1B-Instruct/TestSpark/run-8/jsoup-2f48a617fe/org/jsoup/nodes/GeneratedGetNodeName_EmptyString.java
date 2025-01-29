package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.select.Elements;

public class GeneratedGetNodeName_EmptyString {

    public static String nodeName(String commentText) {
        return commentText == null ? "Comment" : commentText.nodeName();
    }

    public static String getNodeName(Comment comment) {
        return comment.getNodeName();
    }

    @Test
    public void getNodeName_EmptyString() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = "";
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("", getNodeName(comment));
    }

}