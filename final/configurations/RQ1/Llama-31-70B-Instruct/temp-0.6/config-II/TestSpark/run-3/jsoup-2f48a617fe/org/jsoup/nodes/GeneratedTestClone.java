package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("Test comment");
        Comment clone = comment.clone();
        Assert.assertEquals(comment, clone);
    }

}