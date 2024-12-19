package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedAsXmlDeclaration_ReturnsNull {

    @Test
    public void asXmlDeclaration_ReturnsNull() {
        Comment comment = new Comment("Hello World!");
        assertNull(comment.asXmlDeclaration());
    }

}