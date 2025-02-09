package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "new comment data";
        Comment comment = new Comment("");
        Comment updatedComment = comment.setData(data);

        Assert.assertEquals(data, updatedComment.getData());
    }

}