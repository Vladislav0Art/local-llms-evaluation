package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.XmlDeclaration;
import org.jsoup.parser.NodeUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test comment");
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 1, new Document("").outputSettings());
        assertEquals("<!--Test comment-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 1, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("<!--Test comment-->", comment.toString());
    }

}