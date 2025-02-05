package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "Test Comment";
        Comment comment = new Comment("Initial Comment");
        comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

}