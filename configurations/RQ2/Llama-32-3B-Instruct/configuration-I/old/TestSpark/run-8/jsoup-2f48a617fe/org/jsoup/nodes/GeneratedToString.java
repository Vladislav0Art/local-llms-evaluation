package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedToString {

    @Test
    public void toString() {
        Comment comment = new Comment("data");
        assertNotNull(comment.toString());
        assertTrue(comment.toString().contains("data"));
    }

}