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
    public void nodeNameTest() {
        Comment comment = new Comment("Test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        String testData = "Test data";
        Comment comment = new Comment(testData);
        Assert.assertEquals(testData, comment.getData());
    }

    @Test
    public void setDataTest() {
        String testData = "Test data";
        Comment comment = new Comment("Initial data");
        Comment updatedComment = comment.setData(testData);

        Assert.assertEquals(testData, updatedComment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test");
        StringWriter writer = new StringWriter();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        comment.outerHtmlHead(writer, 0, outputSettings);
        Assert.assertTrue(writer.toString().contains("Test"));
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test");
        StringWriter writer = new StringWriter();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        comment.outerHtmlTail(writer, 0, outputSettings);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test");
        Assert.assertTrue(comment.toString().contains("Test"));
    }

    @Test
    public void cloneTest() {
        Comment originalComment = new Comment("Test");
        Comment clonedComment = originalComment.clone();

        Assert.assertNotSame(originalComment, clonedComment);
        Assert.assertEquals(originalComment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\"?>");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTestTrue() {
        Comment comment = new Comment("<?xml version=\"1.0\"?>");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTestFalse() {
        Comment comment = new Comment("This is not an XML declaration");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}