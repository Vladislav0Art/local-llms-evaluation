package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Some comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Some comment");
        assertEquals("Some comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Some comment");
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Some comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Document.OutputSettings.create());
        assertEquals("<!--Some comment-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Some comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Document.OutputSettings.create());
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Some comment");
        assertEquals("Comment[Some comment]", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Some comment");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

}