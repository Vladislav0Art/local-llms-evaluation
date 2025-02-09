package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCommentDataTest {

    @Test
    public void CommentDataTest() {
        String data = "testData";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

}