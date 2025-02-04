package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationShouldReturnTrueForDeclaringNode {

    @Test
    public void isXmlDeclarationShouldReturnTrueForDeclaringNode() {
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}