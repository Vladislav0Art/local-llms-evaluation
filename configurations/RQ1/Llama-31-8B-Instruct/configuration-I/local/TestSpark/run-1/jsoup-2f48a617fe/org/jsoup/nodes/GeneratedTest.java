package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
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
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() throws IOException {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertEquals(comment, clone);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest2() {
        Comment comment = new Comment("?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest3() {
        Comment comment = new Comment("test");
        assertFalse(comment.isXmlDeclaration());
    }

}