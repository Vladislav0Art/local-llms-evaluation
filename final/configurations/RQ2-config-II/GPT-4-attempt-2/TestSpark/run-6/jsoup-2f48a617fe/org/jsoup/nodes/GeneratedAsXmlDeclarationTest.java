package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test comment");
        assertNull(comment.asXmlDeclaration());
    }

}