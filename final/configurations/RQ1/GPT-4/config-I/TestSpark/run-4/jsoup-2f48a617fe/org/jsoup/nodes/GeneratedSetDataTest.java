package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Data");
        comment.setData("New Test Data");
        Assert.assertEquals("New Test Data", comment.getData());
    }

}