package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "newData";
        Comment comment = new Comment("testData");
        Comment newDataComment = comment.setData(data);
        Assert.assertEquals(data, newDataComment.getData());
    }

}