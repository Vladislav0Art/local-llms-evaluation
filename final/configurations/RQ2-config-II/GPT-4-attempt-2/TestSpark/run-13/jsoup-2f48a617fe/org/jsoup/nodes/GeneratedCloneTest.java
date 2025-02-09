package org.jsoup.nodes;

import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        Assert.assertEquals(comment.getData(), clone.getData());
    }

}