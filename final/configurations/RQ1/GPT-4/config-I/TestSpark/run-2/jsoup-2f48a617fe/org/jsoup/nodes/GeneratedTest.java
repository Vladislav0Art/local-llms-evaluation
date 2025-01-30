package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("Test Comment", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataAndSetDataTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("Test Comment", comment.getData());
        comment.setData("New Test Comment");
        assertEquals("New Test Comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Comment content");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Comment content-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws Exception {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Comment content");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isNotXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("xml", xmlDeclaration.name());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("<!--Test Comment-->", comment.toString());
    }

}