package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}