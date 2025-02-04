package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNode_isComment() {
        Comment comment = new Comment("<!-- data -->");
        assert comment instanceof org.jsoup.nodes.Comment;
    }

    @Test
    public void setData_setsData() {
        String originalData = "some data";
        Comment comment = new Comment(originalData);
        String newData = "new data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void clone_isSameType() throws CloneNotSupportedException {
        Comment comment = new Comment("<!-- data -->");
        Comment clonedComment = (Comment) comment.clone();
        assert clonedComment instanceof org.jsoup.nodes.Comment;
    }

    @Test
    public void isXmlDeclaration_returnsTrue() {
        String data = "/* some data */";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_parsesDataCorrectly() throws IOException, CloneNotSupportedException {
        String data = "<!-- data -->";
        Comment comment = new Comment(data);
        XmlDeclaration decl = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void asXmlDeclaration_returnsNullForInvalidData() throws IOException, CloneNotSupportedException {
        String data = "<data>";
        Comment comment = new Comment(data);
        assert comment.asXmlDeclaration() == null;
    }

    @Test
    public void outerHtmlHead_appendsCommentData() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Document doc = new Document();
        Element element = new Element("div");
        doc.appendChild(element);
        comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- data -->", accum.toString());
    }

    @Test
    public void outerHtmlTail_doesNothing() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void toString_returnsOuterHtml() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- data -->", comment.toString());
    }

}