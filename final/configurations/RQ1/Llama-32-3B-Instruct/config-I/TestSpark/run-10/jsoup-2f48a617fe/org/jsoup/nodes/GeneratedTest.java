package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void newComment_GivenData_ReturnsSameData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeName_GivenReturnsNodeName() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHead_GivenOutputSettings_andParentNode_ReturnsResultAsString() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);

        when(outputSettings.prettyPrint()).thenReturn(true);
        when(parentNode.tag().formatAsBlock()).thenReturn(true);

        Comment comment = new Comment("");
        String result = comment.outerHtmlHead(appendable, depth, outputSettings);
        assertNotNull(result);
    }

    @Test
    public void outerHtmlTail_GivenOutputSettings_andParentNode_ReturnsEmptyResult() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);

        Comment comment = new Comment("");
        String result = comment.outerHtmlTail(appendable, depth, outputSettings);
        assertEquals("", result);
    }

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);

        Comment comment = new Comment("");
        Object result = comment.toString();
        assertNotNull(result);
    }

    @Test
    public void clone_ReturnsSameComment() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertTrue(comment.equals(clonedComment));
    }

    @Test
    public void isXmlDeclaration_GivenData_ReturnsFalse() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_GivenXmlDeclarationData_ReturnsTrue() {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_GivenXmlDeclarationData_ReturnsEmptyString() {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"";
        Comment comment = new Comment(data);
        assertEquals("", comment.asXmlDeclaration());
    }
}

public class Document implements Appendable {

    public static interface OutputSettings {
    }

    public boolean prettyPrint() {
        return true;
    }

    @Override
    public void append(String data) {
    }

    @Override
    public String toString() {
        return "";
    }

    public Comment asXmlDeclaration() {
        return null;
    }
}

public class Element implements Appendable {

    public String tag() {
        return "tag";
    }

    public String formatAsBlock() {
        return "";
    }
}

public class Comment {

    private Document document;

    public Comment(String data) {
        this.document = new Document();
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public void append(String data) {
    }

    public Document getDocument() {
        return document;
    }

    public String getData() {
        return "";
    }

    public static Comment createComment(String data) {
        return new Comment(data);
    }

}