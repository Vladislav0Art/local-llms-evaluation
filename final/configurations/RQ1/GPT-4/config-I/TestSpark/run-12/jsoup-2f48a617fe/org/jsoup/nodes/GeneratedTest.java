package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        String nodeName = comment.nodeName();
        Assert.assertEquals("#comment", nodeName);
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        String data = comment.getData();
        Assert.assertEquals("data", data);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        Comment updatedComment = comment.setData("new data");
        String expectedCommentData = "new data";
        Assert.assertEquals(expectedCommentData, updatedComment.getData());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("<!--data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Assert.assertNotSame(comment, comment.clone());
    }

    @Test
    public void isXmlDeclarationTrueTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("not a xml declaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
    }

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("not a xml declaration");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNull(xmlDeclaration);
    }

}