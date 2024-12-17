package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newComment_ReturnsCorrectNode() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
        assertEquals(comment.getData(), comment.getData());
    }

    @Test
    public void newCommentsetData_DataIsCorrectlySet() throws IOException {
        Comment comment = new Comment("");
        comment.setData("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void outerHtmlHead_PrettyPrintedAndBlockTag_PrettifiedComment() throws IOException {
        Comment comment = new Comment("This is a comment");
        Document document = new Document();
        Element parentNode = new Element(document, "div");
        parentNode.appendChild(comment);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq("<!--This is a comment-->"));
    }

    @Test
    public void outerHtmlHead_notPrettifiedNorBlockTag_CommentNotPrettified() throws IOException {
        Comment comment = new Comment("");
        Document document = new Document();
        Element parentNode = new Element(document, "div");
        parentNode.appendChild(comment);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq(""));
    }

    @Test
    public void outerHtmlTail_isEmptyNoOutput() {
        Comment comment = new Comment("");
        Document document = new Document();
        Element parentNode = new Element(document, "div");
        parentNode.appendChild(comment);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(eq(""));
    }

    @Test
    public void clone_ReturnsCorrectNode() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclaration_ReturnsTrue_WithCorrectData() {
        Comment comment = new Comment("<?xml version=\"1.0\"?> This is a comment");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse_WithoutCorrectData() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }
}

class Document {
    private List Element>children;

    public Element appendElement(String name) {
        Element element = new Element(this, name);
        return element;
    }

    public void appendChild(Element child) {
        children.add(child);
    }
}

class Appendable implements Appendable {
    @Override
    public void append(String s) {
        // implementation of append method
    }

    @Override
    public void append(char c) {
        // implementation of append method
    }

    @Override
    public String toString() {
        // implementation of toString method
    }
}

class Element {
    private Document document;
    private String name;

    public Element(Document document, String name) {
        this.document = document;
        this.name = name;
    }

    public void appendChild(Element child) {
        // implementation of appendChild method
    }

    @Override
    public String toString() {
        return name;
    }
}

class Document.

OutputSettings {
    private boolean prettyPrint;
    private boolean outline;

    @Override
    public boolean out ()
		throws IOException {
        return outline;
    }

}