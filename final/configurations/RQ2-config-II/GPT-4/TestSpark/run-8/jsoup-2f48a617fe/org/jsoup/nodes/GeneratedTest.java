package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("Test Comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Comment");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test Comment");
        StringWriter accum = new StringWriter();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Test Comment-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test Comment");
        StringWriter accum = new StringWriter();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString()); //Comment does not have outer tail. It should be empty.
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test Comment");
        assertTrue(comment.toString().startsWith("<!--"));
        assertTrue(comment.toString().endsWith("-->"));
        assertTrue(comment.toString().contains("Test Comment"));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Comment");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertNull(comment.asXmlDeclaration());
    }

}