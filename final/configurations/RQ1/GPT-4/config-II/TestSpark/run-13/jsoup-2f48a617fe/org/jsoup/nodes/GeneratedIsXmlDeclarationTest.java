package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsXmlDeclarationTest {

    // Testing constructor and constructors related methods

    @Test
    public void isXmlDeclarationTest() {
        Comment commentNotXml = new Comment("test comment");
        assertFalse(commentNotXml.isXmlDeclaration());
        Comment commentXml1 = new Comment("!xml test");
        assertTrue(commentXml1.isXmlDeclaration());
        Comment commentXml2 = new Comment("?xml test");
        assertTrue(commentXml2.isXmlDeclaration());
    }

}