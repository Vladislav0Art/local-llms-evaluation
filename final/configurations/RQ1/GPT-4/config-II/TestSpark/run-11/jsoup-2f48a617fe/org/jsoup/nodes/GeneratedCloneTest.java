package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("Test data");
        Comment comment2 = comment1.clone();

        Assert.assertNotSame(comment1, comment2);
        Assert.assertEquals(comment1.getData(), comment2.getData());
    }

}