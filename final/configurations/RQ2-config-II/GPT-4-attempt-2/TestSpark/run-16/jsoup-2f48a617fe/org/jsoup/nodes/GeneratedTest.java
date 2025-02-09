package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Objects;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        String data = "test";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        String data = "test";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("new test");
        Assert.assertEquals("new test", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertTrue(accum.length() > 0);
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, outputSettings);
        Assert.assertTrue(accum.length() > 0);
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertTrue(Objects.nonNull(comment.toString()));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        LeafNode clone = comment.clone();
        Assert.assertEquals(clone.getClass(), Comment.class);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test");
        comment.asXmlDeclaration();
    }

}