package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldCastCommentToXmlDeclaration {

    private Comment comment;

    @Test
    public void shouldCastCommentToXmlDeclaration() {
        comment = new Comment("Test");
        assertNull(comment.asXmlDeclaration());
    }

}