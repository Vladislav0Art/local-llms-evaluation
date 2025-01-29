package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetData_ReturnsCommentWithsetData {

    @Test
    public void setData_ReturnsCommentWithsetData() {
        Comment comment = new Comment("This is a test comment");
        comment.setData("This is another test data");
        Assert.assertEquals("This is a test comment with data This is another test data", comment.getData());
    }

}