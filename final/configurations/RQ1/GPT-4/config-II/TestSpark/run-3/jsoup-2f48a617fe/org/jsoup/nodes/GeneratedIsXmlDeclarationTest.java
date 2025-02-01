package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment commentNode = new Comment("!xml");
        assertTrue(commentNode.isXmlDeclaration());
        commentNode = new Comment("normal");
        assertFalse(commentNode.isXmlDeclaration());
    }

}