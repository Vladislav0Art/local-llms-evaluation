package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Objects;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String data = "test";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

}