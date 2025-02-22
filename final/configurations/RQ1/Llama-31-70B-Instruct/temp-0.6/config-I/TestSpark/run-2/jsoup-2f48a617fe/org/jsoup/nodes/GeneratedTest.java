package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());

        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void outerHtmlTest() {
        Comment comment = new Comment("test");

        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, Mockito.mock(Document.OutputSettings.class));
        comment.outerHtmlTail(sb, 0, Mockito.mock(Document.OutputSettings.class));

        assertEquals("<!--test-->", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!test");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!test");
        XmlDeclaration decl = comment.asXmlDeclaration();

        assertEquals("test", decl.getTagName());
        assertTrue(decl.isProcessingInstruction());
    }

}