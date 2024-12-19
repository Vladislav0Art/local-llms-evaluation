package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedTest {

    @Test
    public void CreateCommentTest() {
        Comment comment = new Comment("This is a test comment");
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a test comment", comment.getData());
    }

    @Test
    public void SetDataTest() {
        Comment comment = new Comment("");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void GetNodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Document document = new Document();
        Element element = new Element("div");
        Comment comment = new Comment("");
        document.appendChild(comment);
        document.appendChild(element);
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, document.outputSettings());
        System.out.flush();
        String result = outContent.toString();
        assertEquals("<!--This is a test comment-->", result);
    }

    @Test
    public void OuterHtmlTailTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Document document = new Document();
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, document.outputSettings());
        System.out.flush();
        String result = outContent.toString();
        assertTrue(result.contains(""));
    }

    @Test
    public void CloneTest() {
        Comment originalComment = new Comment("");
        Comment clonedComment = originalComment.clone();
        assertNotEquals(originalComment, clonedComment);
    }

    @Test
    public void IsXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void AsXmlDeclarationTest() {
        Comment comment = new Comment("");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNull(result);
    }

}