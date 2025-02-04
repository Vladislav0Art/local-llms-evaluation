package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newNode_CreatedWithCorrectData() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void nodeName_ReturnsCorrectValue() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getData_ReturnsCorrectData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setData

    SetsCorrectData() {
        Comment comment = new Comment("");
        String expected = "Hello World!";
        comment.setData(expected);
        assertNotNull(comment);
        assertEquals(expected, comment.getData());
    }

    @Test
    public void outerHtmlHead_PrettyPrintedValueIncludesCommentText() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--data-->",
                outContent.toString().trim());
    }

    @Test
    public void outerHtmlHead_PrettyPrintedValueDoesNotIncludeXmlDeclaration() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("!");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--!-->", outContent.toString().trim());
    }

    @Test
    public void outerHtmlTailDoesNotModifyTheDOM() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<--!",
                outContent.toString().trim());
    }

    @Test
    public void toString_ReturnsCorrectOuterHTML() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtml(accum, 0, out);
        assertEquals("<!--data-->",
                outContent.toString().trim());
    }

    @Test
    public void clone_ReturnsSameInstance() {
        Comment original = new Comment("data");
        Comment clone = original.clone();
        assertSame(original, clone);
    }

    @Test
    public void isXmlDeclaration_ReturnsFalseForSimpleString() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_ReturnsTrueForXmlDeclarationData() {
        Comment comment = new Comment("!DOCTYPE");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_RaisesNullPointerExceptionIfNull() {
        Comment comment = new Comment("");
        NullPointerException expected = null;
        assertThrows(expected, () -> comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ConvertsToCorrectXmlDeclaration() throws IOException {
        Comment comment = new Comment("!");
        XmlDeclaration decl = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("!DOCTYPE", decl.content());
    }

}