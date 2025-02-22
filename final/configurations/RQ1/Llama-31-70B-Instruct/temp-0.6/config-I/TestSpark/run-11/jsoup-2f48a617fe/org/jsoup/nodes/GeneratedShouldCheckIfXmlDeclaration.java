package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldCheckIfXmlDeclaration {

    private Comment comment;

    @Test
    public void shouldCheckIfXmlDeclaration() {
        comment = new Comment("Test");
        assertFalse(comment.isXmlDeclaration());
    }

}