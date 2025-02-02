package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeUtils;

public class GeneratedTest {

    public static class AppendableStub implements Appendable {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();

        @Override
        public void append(CharSequence cs) {
            out.append(cs);
        }

        @Override
        public void append(CharSequence cs, int start, int end) {
            out.append(cs, start, end);
        }

        public String getContents() {
            return out.toString();
        }
    }

    @Test
    public void testConstructorWithData() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment.value);
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void testConstructorsAreEqual() {
        Comment comment1 = new Comment("Hello World");
        Comment comment2 = new Comment("Hello World");
        assertTrue(comment1.equals(comment2));
    }

    @Test
    public void testConstructorWithEmptyData() {
        Comment comment = new Comment("");
        assertNotNull(comment.value);
        assertEquals("", comment.getData());
    }

    @Test
    public void test

    nodeName() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void test

    getData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void test

    setData() {
        String originalData = "Hello World";
        AppendableStub appendable = new AppendableStub();
        Comment comment = new Comment(originalData);
        comment.setData("New Data");
        assertEquals(originalData, comment.getData());
        assertTrue(comment.value.equals("New Data"));
    }

    @Test
    public void test

    outerHtmlHead() throws IOException {
        Document.OutputSettings settings = Document.OutputSettings.builder().prettyPrint(true).build();
        AppendableStub appendable = new AppendableStub();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(appendable, 1, settings);
        assertEquals("<!--Hello World--><-->", appendable.getContents());
    }

    @Test
    public void test

    outerHtmlTail() {
        Document.OutputSettings settings = Document.OutputSettings.builder().prettyPrint(true).build();
        AppendableStub appendable = new AppendableStub();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlTail(appendable, 1, settings);
        assertEquals("", appendable.getContents());
    }

    @Test
    public void test

    toString() throws IOException {
        Document.OutputSettings settings = Document.OutputSettings.builder().prettyPrint(true).build();
        AppendableStub appendable = new AppendableStub();
        Comment comment = new Comment("Hello World");
        comment.outerHtml(appendable, 1, settings);
        assertEquals("<!--Hello World--><-->", appendable.getContents());
    }

    @Test
    public void test

    clone() {
        Comment comment = new Comment("Hello World");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertSame(comment, clonedComment);
    }

    @Test
    public void test

    isXmlDeclarationWithValidData() {
        Comment comment = new Comment("!XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void test

    isXmlDeclarationWithoutValidData() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void test

    asXmlDeclaration() {
        Comment comment = new Comment("Hello World");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

    @Test
    public void test

    asXmlDeclarationWithValidData() {
        String data = "<!XML Declaration>";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}