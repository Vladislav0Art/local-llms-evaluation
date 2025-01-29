package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedGetData_SimpleCase {

    @Test
    public void getData_SimpleCase() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = "This is a simple comment";
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("This is a simple comment", comment.getData());
    }

}