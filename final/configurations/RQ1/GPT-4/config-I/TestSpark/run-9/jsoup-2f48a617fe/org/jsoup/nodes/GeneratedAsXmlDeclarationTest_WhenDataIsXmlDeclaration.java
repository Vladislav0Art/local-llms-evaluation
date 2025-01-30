package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAsXmlDeclarationTest_WhenDataIsXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_WhenDataIsXmlDeclaration() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertNotNull(comment.asXmlDeclaration());
    }

}