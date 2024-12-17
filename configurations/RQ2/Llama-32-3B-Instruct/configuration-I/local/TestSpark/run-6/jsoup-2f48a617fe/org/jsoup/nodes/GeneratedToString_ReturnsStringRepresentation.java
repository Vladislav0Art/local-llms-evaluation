package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedToString_ReturnsStringRepresentation {

    @Test
    public void toString_ReturnsStringRepresentation() {
        Comment comment = new Comment("Hello World!");
        assertEquals("<!-- comment -->", comment.toString());
    }

}