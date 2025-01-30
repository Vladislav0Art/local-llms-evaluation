package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationNullTest {

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"");
        XmlDeclaration xml = comment.asXmlDeclaration();
        assertNull(xml);
    }

}