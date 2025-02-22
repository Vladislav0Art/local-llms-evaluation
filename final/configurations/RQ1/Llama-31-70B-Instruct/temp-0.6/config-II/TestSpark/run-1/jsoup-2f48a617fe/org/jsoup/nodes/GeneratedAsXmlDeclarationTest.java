package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        assertNotNull(xmlDeclaration);
        assertEquals("!DOCTYPE html", xmlDeclaration.getData());
    }

}