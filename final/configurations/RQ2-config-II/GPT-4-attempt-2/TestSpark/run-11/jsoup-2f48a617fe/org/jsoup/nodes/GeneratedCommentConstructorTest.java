package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String data = "testData";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

}