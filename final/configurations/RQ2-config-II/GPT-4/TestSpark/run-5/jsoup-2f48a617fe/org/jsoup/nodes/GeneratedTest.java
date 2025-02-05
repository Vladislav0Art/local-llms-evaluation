package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("Test data");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test data");
        Assert.assertEquals("Test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test data");
        comment.setData("New test data");
        Assert.assertEquals("New test data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringWriter output = new StringWriter();
        comment.outerHtmlHead(output, 0, new Document("").outputSettings());
        Assert.assertEquals("<!--Test data-->", output.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringWriter output = new StringWriter();
        comment.outerHtmlTail(output, 0, new Document("").outputSettings());
        Assert.assertEquals("", output.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test data");
        Assert.assertEquals("<!--Test data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloned = comment.clone();
        Assert.assertNotNull(cloned);
        Assert.assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}