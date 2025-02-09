package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clonedComment = comment.clone();
        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

}