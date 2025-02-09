package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        String data = "test comment";
        Comment comment = new Comment(data);

        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        String nodeName = comment.nodeName();

        Assert.assertEquals("#comment", nodeName);
    }

    @Test
    public void getDataTest() {
        String data = "test comment";
        Comment comment = new Comment(data);

        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void setDataTest() {
        String data = "new comment data";
        Comment comment = new Comment("");
        Comment updatedComment = comment.setData(data);

        Assert.assertEquals(data, updatedComment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String data = "test comment";
        Comment comment = new Comment(data);
        StringWriter writer = new StringWriter();

        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());

        Assert.assertEquals("<!--" + data + "-->", writer.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("");
        StringWriter writer = new StringWriter();

        comment.outerHtmlTail(writer, 0, new Document.OutputSettings());

        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void cloneTest() {
        String data = "test comment";
        Comment comment = new Comment(data);
        Comment clone = comment.clone();

        Assert.assertEquals(comment.getData(), clone.getData());
        Assert.assertNotSame(comment, clone);
    }

    @Test
    public void isXmlDeclarationTest() {
        String data = "xml";
        Comment comment = new Comment(data);

        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        String data = "xml";
        Comment comment = new Comment(data);

        Assert.assertNull(comment.asXmlDeclaration());
    }

}