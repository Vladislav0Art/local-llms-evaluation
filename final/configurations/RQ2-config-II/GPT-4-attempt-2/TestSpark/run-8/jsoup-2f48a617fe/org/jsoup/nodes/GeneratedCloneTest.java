package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment cloneComment = comment.clone();
        Assert.assertEquals("testData", cloneComment.getData());
    }

}