package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("Test comment");
        comment.setData("Updated comment");
        Assert.assertEquals("Updated comment", comment.getData());
    }

}