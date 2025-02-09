package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}