package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    // Testing constructor and constructors related methods

    @Test
    public void CommentGetDataTest() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

    @Test
    public void CommentSetDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.indentAmount(1).prettyPrint(true);
        comment.outerHtmlHead(stringBuilder, 0, outputSettings);
        assertEquals("<!--test comment-->", stringBuilder.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(stringBuilder, 0, outputSettings);
        assertEquals("", stringBuilder.toString());  // Expected nothing to be appended
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment clonedComment = comment.clone();
        assertNotEquals(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment commentNotXml = new Comment("test comment");
        assertFalse(commentNotXml.isXmlDeclaration());
        Comment commentXml1 = new Comment("!xml test");
        assertTrue(commentXml1.isXmlDeclaration());
        Comment commentXml2 = new Comment("?xml test");
        assertTrue(commentXml2.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("1.0", xmlDeclaration.attr("version"));
        assertEquals("UTF-8", xmlDeclaration.attr("encoding"));
    }

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("Not xml declaration");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}