package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedToStringCommentNotCalled {

    @Test
    public void toStringCommentNotCalled() {
        Comment comment = new Comment("data");
        assertNotNull(comment.toString());
    }

}