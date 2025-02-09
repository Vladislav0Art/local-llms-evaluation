package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedCommentDataConstructorTest {

    @Test
    public void CommentDataConstructorTest() {
        String data = "testData";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

}