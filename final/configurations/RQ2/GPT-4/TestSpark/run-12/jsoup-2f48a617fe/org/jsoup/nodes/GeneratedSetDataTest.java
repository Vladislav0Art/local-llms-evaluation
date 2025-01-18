package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String newData = "new test comment";
        Comment comment = new Comment("test comment");
        comment.setData(newData);
        Assert.assertEquals(newData, comment.getData());
    }

}