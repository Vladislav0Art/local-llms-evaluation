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
        String testData = "Test data";
        Comment comment = new Comment("Initial data");
        Comment updatedComment = comment.setData(testData);

        Assert.assertEquals(testData, updatedComment.getData());
    }

}