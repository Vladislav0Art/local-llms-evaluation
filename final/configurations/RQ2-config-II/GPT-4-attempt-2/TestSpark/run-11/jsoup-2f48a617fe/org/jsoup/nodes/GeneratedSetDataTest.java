package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "testData";
        Comment comment = new Comment("");
        comment = comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

}