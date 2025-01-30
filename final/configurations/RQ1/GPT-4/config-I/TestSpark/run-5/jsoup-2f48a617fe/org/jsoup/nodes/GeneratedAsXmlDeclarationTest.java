package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        String data = "?xml version=\"1.0\"?";
        Comment comment = new Comment(data);
        assertNotNull(comment.asXmlDeclaration());
    }

}