package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("Test Data");
        Comment comment2 = comment1.clone();
        Assert.assertNotSame(comment1, comment2);
        Assert.assertEquals(comment1.toString(), comment2.toString());
    }

}