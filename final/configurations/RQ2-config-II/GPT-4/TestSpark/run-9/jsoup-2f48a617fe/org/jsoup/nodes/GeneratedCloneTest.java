package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        Comment cloneComment = comment.clone();

        Assert.assertEquals(comment.getData(), cloneComment.getData());
        Assert.assertNotSame(comment, cloneComment);
    }

}