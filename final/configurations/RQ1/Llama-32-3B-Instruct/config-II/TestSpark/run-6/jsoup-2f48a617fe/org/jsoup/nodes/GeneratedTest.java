package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        String data = "newData";
        comment.setData(data);
        assertTrue(comment.getData().equals(data));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<!--data-->";
        assertTrue(accum.toString().equals(expectedOutput));
    }

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(false, false);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        assertTrue(!accum.toString().contains(""));
    }

    @Test
    public void toStringTest() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        String expectedOutput = "<!--data-->";
        comment.outerHtml(accum, 0, out);
        assertTrue(accum.toString().equals(expectedOutput));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationTrueTest() {
        String data = "/* This is an XML declaration */";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationFalseTest() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTrueTest() throws IOException {
        String data = "data";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl != null);
    }

    @Test
    public void asXmlDeclarationFalseTest() {
        Comment comment = new Comment("/* This is not an XML declaration */");
        assertNull(comment.asXmlDeclaration());
    }

}