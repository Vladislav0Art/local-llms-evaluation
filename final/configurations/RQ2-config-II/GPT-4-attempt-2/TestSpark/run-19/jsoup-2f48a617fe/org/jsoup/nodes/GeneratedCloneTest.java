package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        Assert.assertNotSame(comment, cloned);
        Assert.assertEquals(comment.getData(), cloned.getData());
    }

}