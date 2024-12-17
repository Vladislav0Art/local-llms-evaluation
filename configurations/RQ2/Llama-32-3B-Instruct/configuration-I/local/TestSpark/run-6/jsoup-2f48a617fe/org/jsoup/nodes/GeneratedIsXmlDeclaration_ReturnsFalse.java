package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

}