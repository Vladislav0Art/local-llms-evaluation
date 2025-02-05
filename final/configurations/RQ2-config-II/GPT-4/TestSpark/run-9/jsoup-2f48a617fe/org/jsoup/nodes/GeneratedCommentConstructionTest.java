package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCommentConstructionTest {

    @Test
    public void CommentConstructionTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        Assert.assertEquals(data, comment.getData());
    }

}