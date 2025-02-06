package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetDataMethodReturnsStringData {

    @Test
    public void getDataMethodReturnsStringData() {
        Comment comment = new Comment("");
        String data = "data";
        comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

}