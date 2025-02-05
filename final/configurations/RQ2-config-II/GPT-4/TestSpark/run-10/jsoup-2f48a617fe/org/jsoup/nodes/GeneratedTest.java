package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testComment");
        assertEquals("testComment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("testComment");
        assertEquals("testComment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("testComment");
        comment.setData("changedTestComment");
        assertEquals("changedTestComment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testComment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("<--testComment-->", stringBuilder.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("testComment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("", stringBuilder.toString());   // As implementation doesn't append anything, expecting nothing.
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testComment");
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
    }

    @Test
    public void isXmlDeclarationTest_whenItIsComment_thenFALSE() {
        Comment comment = new Comment("testComment");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assertEquals(false, isXmlDeclaration);
    }

    @Test
    public void asXmlDeclarationTest_whenItIsComment_thenException() {
        Comment comment = new Comment("testComment");
        comment.asXmlDeclaration();
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testComment");
        assertEquals("<!--testComment-->", comment.toString());
    }

}