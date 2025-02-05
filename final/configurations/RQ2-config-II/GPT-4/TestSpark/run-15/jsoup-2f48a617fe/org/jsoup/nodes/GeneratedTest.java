package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("testData", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("testData");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(accum, 0, out);

        Assert.assertEquals("<!--testData-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(accum, 0, out);

        Assert.assertEquals("", accum.toString()); // Method does not add anything to accum
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("<!--testData-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clonedComment = comment.clone();

        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("testData");

        Assert.assertFalse(comment.isXmlDeclaration()); // Comment does not contain xml declaration
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("testData");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}