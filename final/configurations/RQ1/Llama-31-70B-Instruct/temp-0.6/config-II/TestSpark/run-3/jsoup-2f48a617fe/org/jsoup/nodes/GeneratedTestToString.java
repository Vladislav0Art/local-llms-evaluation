package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("<!--Test comment-->", comment.toString());
    }

}