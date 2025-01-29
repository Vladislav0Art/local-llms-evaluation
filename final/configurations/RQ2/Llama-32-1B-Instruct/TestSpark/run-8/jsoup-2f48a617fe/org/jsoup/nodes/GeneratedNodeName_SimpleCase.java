package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.select.Elements;

public class GeneratedNodeName_SimpleCase {

    public static String nodeName(String commentText) {
        return commentText == null ? "Comment" : commentText.nodeName();
    }

    public static String getNodeName(Comment comment) {
        return comment.getNodeName();
    }

    @Test
    public void nodeName_SimpleCase() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = "This is a simple comment";
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("Comment", nodeName(commentText));
    }

}