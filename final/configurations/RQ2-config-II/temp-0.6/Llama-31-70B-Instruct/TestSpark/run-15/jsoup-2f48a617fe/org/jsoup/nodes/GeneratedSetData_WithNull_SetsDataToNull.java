package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetData_WithNull_SetsDataToNull {

    @Test
    public void setData_WithNull_SetsDataToNull() {
        Comment comment = new Comment("This is a comment");
        comment.setData(null);
        assertNull(comment.getData());
    }

}