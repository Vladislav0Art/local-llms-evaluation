package org.jsoup.nodes;

import org.jsoup.Document;
import org.jsoup.nodes.Document.Builder;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedTest {

    @Test
    public void newNodeNameIsCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void noDataReturnsEmptyStringTest() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void withDataReturnsCorrectDataTest() {
        String data = "Hello, World!";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataUpdatesContentTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadAddsCommentToHTMLTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        AtomicInteger count = new AtomicInteger(0);
        Document.OutputSettings settings = new Document.OutputSettings();

        Comment comment = new Comment("data");
        comment.outerHtmlHead(new StringBuilder(), 1, settings);

        assertEquals(count.get(), 1);
    }

    @Test
    public void outerHtmlTailAddsCommentToHTMLTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        AtomicInteger count = new AtomicInteger(0);
        Document.OutputSettings settings = new Document.OutputSettings();

        Comment comment = new Comment("data");
        comment.outerHtmlTail(new StringBuilder(), 1, settings);

        assertEquals(count.get(), 1);
    }

    @Test
    public void toStringIncludesNodeNameAndDataTest() {
        Comment comment = new Comment("data");
        String expectedOutput = "<comment>data</comment>";
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void asXmlDeclarationReturnsCorrectlyParsedDeclarationTest() {
        String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root>Hello World!</root>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.asXmlDeclaration().tagName().toString().equals("root"));
    }

}