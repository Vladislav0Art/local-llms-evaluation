package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldCloneComment {

    private Comment comment;

    @Test
    public void shouldCloneComment() {
        comment = new Comment("Test");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

}