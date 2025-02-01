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

public class GeneratedAsXmlDeclarationTest {

    // Testing constructor and constructors related methods

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("1.0", xmlDeclaration.attr("version"));
        assertEquals("UTF-8", xmlDeclaration.attr("encoding"));
    }

}