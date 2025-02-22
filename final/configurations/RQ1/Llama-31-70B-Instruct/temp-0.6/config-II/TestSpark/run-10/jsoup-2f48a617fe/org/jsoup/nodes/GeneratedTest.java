package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testGetData() {
        Comment comment = new Comment("Hello, World!");
        assertEquals("Hello, World!", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("Hello, World!");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void testNodeName() {
        Comment comment = new Comment("Hello, World!");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("Hello, World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, new Document().outputSettings());
        assertEquals("<!--Hello, World!-->", builder.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Comment comment = new Comment("Hello, World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, new Document().outputSettings());
        assertEquals("", builder.toString());
    }

}