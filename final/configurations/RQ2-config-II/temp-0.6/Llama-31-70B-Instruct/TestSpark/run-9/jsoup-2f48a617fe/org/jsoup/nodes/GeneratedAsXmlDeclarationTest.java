package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"", decl.getData());
        assertTrue(decl.isDeclaration());
        assertEquals("doctype", decl.nodeName());

        comment = new Comment("Test data");
        decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}