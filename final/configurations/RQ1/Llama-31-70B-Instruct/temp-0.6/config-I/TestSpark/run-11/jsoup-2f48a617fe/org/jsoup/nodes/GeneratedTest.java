package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedTest {

    private Comment comment;

    @Test
    public void shouldCreateCommentNode() {
        comment = new Comment("Test");
        assertNotNull(comment);
    }

    @Test
    public void shouldGetData() {
        comment = new Comment("Test");
        assertEquals("Test", comment.getData());
    }

    @Test
    public void shouldSetData() {
        comment = new Comment("Test");
        comment.setData("New test");
        assertEquals("New test", comment.getData());
    }

    @Test
    public void shouldGetNodeName() {
        comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void shouldWriteOuterHtml() throws IOException {
        comment = new Comment("Test");
        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("<!--Test-->", writer.toString());
    }

    @Test
    public void shouldCloneComment() {
        comment = new Comment("Test");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void shouldCheckIfXmlDeclaration() {
        comment = new Comment("Test");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void shouldCastCommentToXmlDeclaration() {
        comment = new Comment("Test");
        assertNull(comment.asXmlDeclaration());
    }

}