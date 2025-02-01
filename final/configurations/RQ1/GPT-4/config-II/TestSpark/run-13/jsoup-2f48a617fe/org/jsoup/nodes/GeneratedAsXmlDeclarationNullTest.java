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

public class GeneratedAsXmlDeclarationNullTest {

    // Testing constructor and constructors related methods

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("Not xml declaration");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}