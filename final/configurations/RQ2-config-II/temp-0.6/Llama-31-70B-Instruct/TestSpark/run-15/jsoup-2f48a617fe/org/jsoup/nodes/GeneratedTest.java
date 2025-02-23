package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("new test");
        Assert.assertEquals("new test", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        String html = comment.outerHtml();
        Assert.assertEquals("<!--test-->", html);
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("", comment.outerHtmlTail());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        Assert.assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}