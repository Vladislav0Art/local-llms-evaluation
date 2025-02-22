package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldCreateCommentNode {

    private Comment comment;

    @Test
    public void shouldCreateCommentNode() {
        comment = new Comment("Test");
        assertNotNull(comment);
    }

}