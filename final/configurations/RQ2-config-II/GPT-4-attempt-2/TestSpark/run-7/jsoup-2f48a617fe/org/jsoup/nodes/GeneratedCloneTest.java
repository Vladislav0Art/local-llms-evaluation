package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clone = comment.clone();
        Assert.assertEquals(clone.toString(), comment.toString());
    }

}