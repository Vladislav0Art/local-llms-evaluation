package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment1 = new Comment("!DOCTYPE html");
        assertNotNull(comment1.asXmlDeclaration());

        Comment comment2 = new Comment("INVALID DECLARATION");
        assertNull(comment2.asXmlDeclaration());
    }

}