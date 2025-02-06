package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void ConstructorWithValidDataCreatesComment() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void NodeNameReturnsExpectedValue() {
        String data = "comment";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void GetDataReturnsCorrectData() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void SetDataSetsNewDataProperly() {
        String expectedData = "New Data";
        Comment comment = new Comment("Old Data");
        comment.setData(expectedData);
        assertEquals(expectedData, comment.getData());
    }

    @Test
    public void OuterHtmlHeadSetsCorrectOutputHtmlProperly() throws IOException {
        Parser parser = new Parser(ParseSettings.parseAll());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = parser.parse("<comment>Hello World</comment>");
        LeafNode node = document.head().children().get(0);
        Comment comment = (Comment) node;
        comment.outerHtmlHead(out, 0, null);
        String expectedOutput = "<!-- comment -->\nHello World\n";
        assertTrue(out.toString().contains(expectedOutput));
    }

    @Test
    public void OuterHtmlTailDoesNotAppendAnything() throws IOException {
        Parser parser = new Parser(ParseSettings.parseAll());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = parser.parse("<comment>Hello World</comment>");
        LeafNode node = document.head().children().get(0);
        Comment comment = (Comment) node;
        comment.outerHtmlTail(out, 0, null);
        assertTrue(out.toString().isEmpty());
    }

    @Test
    public void ToStringReturnsCorrectOutput() {
        String expectedOutput = "<!-- comment -->\nHello World\n";
        Comment comment = new Comment("Hello World");
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void CloneCreatesNewCommentWithoutAnyChanges() {
        Comment comment = new Comment("Hello World");
        Comment clone = comment.clone();
        assertNotNull(clone);
        assertFalse(clone.equals(comment));
    }

    @Test
    public void IsXmlDeclarationReturnsFalseForComment() {
        Comment comment = new Comment("Hello World");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void AsXmlDeclarationReturnsNullForComment() {
        Comment comment = new Comment("Hello World");
        assertNull(comment.asXmlDeclaration());
    }

}