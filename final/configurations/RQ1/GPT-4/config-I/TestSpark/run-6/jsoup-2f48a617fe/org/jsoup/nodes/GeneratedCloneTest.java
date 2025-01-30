package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("cloneTest");
        Comment cloneComment = comment.clone();
        Assert.assertEquals(comment.toString(), cloneComment.toString());
    }

}