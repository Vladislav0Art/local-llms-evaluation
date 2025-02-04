package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationIsCorrect {

    @Test
    public void isXmlDeclarationIsCorrect() {
        Comment comment1 = new Comment("Hello World");
        assertTrue(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("!XML Declaration");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("?XML Declaration");
        assertTrue(comment3.isXmlDeclaration());
    }

}