package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_ReturnsTrue_WithCorrectData {

    @Test
    public void isXmlDeclaration_ReturnsTrue_WithCorrectData() {
        Comment comment = new Comment("<?xml version=\"1.0\"?> This is a comment");
        assertTrue(comment.isXmlDeclaration());
    }

}