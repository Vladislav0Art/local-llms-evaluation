package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment xmlDeclareComment = new Comment("!?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(xmlDeclareComment.asXmlDeclaration());

        Comment normalComment = new Comment("Normal Comment");
        assertNull(normalComment.asXmlDeclaration());
    }

}