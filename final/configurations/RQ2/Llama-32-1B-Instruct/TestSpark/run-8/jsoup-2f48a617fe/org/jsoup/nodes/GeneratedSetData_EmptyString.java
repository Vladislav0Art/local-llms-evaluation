package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedSetData_EmptyString {

    @Test
    public void setData_EmptyString() {
        Comment comment = new Comment("");
        comment.setData("");
        assertEquals("", comment.getData());
    }

}