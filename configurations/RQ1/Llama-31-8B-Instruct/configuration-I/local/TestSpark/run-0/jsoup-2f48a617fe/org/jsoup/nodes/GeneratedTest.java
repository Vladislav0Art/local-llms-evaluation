package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("new test");
        assertEquals("new test", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest2() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest3() {
        Comment comment = new Comment("test");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void asXmlDeclarationTest2() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void asXmlDeclarationTest3() {
        Comment comment = new Comment("test");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}