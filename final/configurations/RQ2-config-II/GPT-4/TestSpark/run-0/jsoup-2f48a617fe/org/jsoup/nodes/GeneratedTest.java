package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test data");
        assertEquals("Test data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Another Test");
        String data = comment.getData();
        assertEquals("Another Test", data);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test data");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringWriter stringWriter = new StringWriter();
        Comment comment = new Comment("Test data");
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        comment.outerHtmlHead(stringWriter, 0, outputSettings);
        assertEquals("<!--Test data-->", stringWriter.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringWriter stringWriter = new StringWriter();
        Comment comment = new Comment("Test data");
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        comment.outerHtmlTail(stringWriter, 0, outputSettings);
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test data");
        String result = comment.toString();

        assertEquals("<!--Test data-->", result);
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloned = comment.clone();

        assertEquals(comment.getData(), cloned.getData());
        assertNotSame(comment, cloned);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        boolean result = comment.isXmlDeclaration();

        assertEquals(true, result);
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Comment.XmlDeclaration result = comment.asXmlDeclaration();

        assertEquals("1.0", result.version());
        assertEquals("UTF-8", result.encoding());
    }

}