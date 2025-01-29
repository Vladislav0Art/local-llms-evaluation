package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedGetData_EmptyString {

    @Test
    public void getData_EmptyString() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = "";
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("", comment.getData());
    }

}