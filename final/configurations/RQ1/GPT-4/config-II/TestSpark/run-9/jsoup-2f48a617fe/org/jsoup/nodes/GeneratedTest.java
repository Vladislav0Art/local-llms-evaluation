package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Comment comment = new Comment("test comment");
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        comment.outerHtmlHead(stringBuilder, 0, out);

        assertEquals("<!--test comment-->", stringBuilder.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Comment comment = new Comment("test comment");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(stringBuilder, 0, out);

        assertEquals("", stringBuilder.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test comment");
        assertEquals("<!--test comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment cloned = comment.clone();

        assertEquals(comment.getData(), cloned.getData());
        assertEquals(comment.toString(), cloned.toString());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment xmlDeclareComment = new Comment("!?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(xmlDeclareComment.isXmlDeclaration());

        Comment normalComment = new Comment("Normal Comment");
        assertFalse(normalComment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment xmlDeclareComment = new Comment("!?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(xmlDeclareComment.asXmlDeclaration());

        Comment normalComment = new Comment("Normal Comment");
        assertNull(normalComment.asXmlDeclaration());
    }

}