package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("testData");
        String newData = "newData";
        comment.setData(newData);
        Assert.assertEquals(newData, comment.getData());
    }

}