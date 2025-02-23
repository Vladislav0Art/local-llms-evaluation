package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Initial data");
        assertEquals("Initial data", comment.getData());

        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("?");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("Test data");
        assertFalse(comment.isXmlDeclaration());
    }

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