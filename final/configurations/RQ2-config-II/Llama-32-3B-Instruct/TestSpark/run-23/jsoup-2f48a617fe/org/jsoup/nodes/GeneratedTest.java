package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test");
        assertNotNull(comment);
        assertEquals("Comment", comment.nodeName());
        assertEquals("test", comment.getData());
    }

    @Test
    public void nodeNameMethodTest() {
        Comment comment = new Comment("test");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataMethodTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataMethodTest() {
        Comment comment = new Comment("test");
        String newData = "newData";
        comment.setData(newData);
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        Comment comment = new Comment("test");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(outContent.toString().contains("<!--"));
    }

    @Test
    public void outerHtmlTailMethodTest() {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(accum.toString().contains("-->"));
    }

    @Test
    public void toStringMethodTest() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneMethodTest() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.nodeName(), clonedComment.getNodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationMethodTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
        assertNotEquals(true, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationMethodTest() throws IOException {
        Comment comment = new Comment("test");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals(comment.getData(), xmlDecl.getData());
        assertEquals(comment.nodeName(), xmlDecl.getTagName());
    }

}