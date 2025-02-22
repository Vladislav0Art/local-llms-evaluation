package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("comment");
        assertEquals("comment", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("comment");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("comment");
        Document document = mock(Document.class);
        comment.setBaseUri(document.location());
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals("comment", decl.getData());
    }

}