package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateCommentWithData_ReturnsComment {

    @Test
    public void createCommentWithData_ReturnsComment() {
        Comment comment = new Comment("Some data");
        assertNotNull(comment);
    }

}