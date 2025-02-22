package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}