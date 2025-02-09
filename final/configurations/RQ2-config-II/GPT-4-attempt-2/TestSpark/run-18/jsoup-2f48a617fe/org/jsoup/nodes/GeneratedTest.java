package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("test");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("updatedTest");
        Assert.assertEquals("updatedTest", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        Assert.assertEquals(comment.getData(), clonedComment.getData());
        Assert.assertNotSame(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNotNULLTest() {
        String data = "?xml version=\"1.0\" encoding=\"UTF-8\"?";
        Comment comment = new Comment(data);
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNULLTest() {
        Comment comment = new Comment("test");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}