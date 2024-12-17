package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("<xml>test</xml>");
        assertTrue(comment.isXmlDeclaration());
    }

}