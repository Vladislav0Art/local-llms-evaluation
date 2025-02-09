package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test comment");
        Assert.assertNotNull(comment);
    }

}