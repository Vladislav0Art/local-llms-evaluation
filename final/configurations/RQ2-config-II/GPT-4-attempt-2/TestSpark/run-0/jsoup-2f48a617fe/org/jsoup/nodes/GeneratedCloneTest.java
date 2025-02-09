package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        Assert.assertNotSame(comment, clone);
        Assert.assertEquals(comment.getData(), clone.getData());
    }

}