package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("Test comment", comment.getData());
    }

}