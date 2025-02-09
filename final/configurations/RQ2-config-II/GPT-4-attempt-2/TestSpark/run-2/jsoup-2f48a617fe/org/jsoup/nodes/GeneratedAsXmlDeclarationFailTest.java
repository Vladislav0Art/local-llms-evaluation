package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationFailTest {

    @Test
    public void asXmlDeclarationFailTest() {
        Comment comment = new Comment("Data");
        assertNull(comment.asXmlDeclaration());
    }

}