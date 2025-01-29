package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedGetData_NullString {

    @Test
    public void getData_NullString() {
        TestJsoupComment testJsoupComment = new TestJsoupComment();
        String commentText = null;
        Comment comment = testJsoupComment.getComment(commentText);
        assertEquals("This is a simple comment", comment.getData());
    }
}

class TestJsoupComment {

    public Comment getComment(String commentText) {
        // Implementation of the getComment method
        return new Comment(commentText);
    }

}