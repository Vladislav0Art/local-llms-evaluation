package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clone = comment.clone();
        Assert.assertNotSame(clone, comment);
        Assert.assertEquals(comment.getData(), clone.getData());
    }

}