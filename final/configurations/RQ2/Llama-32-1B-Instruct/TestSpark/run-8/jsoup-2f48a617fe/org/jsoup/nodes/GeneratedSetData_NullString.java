package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedSetData_NullString {

    @Test
    public void setData_NullString() {
        Comment comment = new Comment(null);
        comment.setData(null);
        assertEquals("", comment.getData());
    }

}