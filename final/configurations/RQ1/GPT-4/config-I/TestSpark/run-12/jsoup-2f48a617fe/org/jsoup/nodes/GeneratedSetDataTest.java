package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        Comment updatedComment = comment.setData("new data");
        String expectedCommentData = "new data";
        Assert.assertEquals(expectedCommentData, updatedComment.getData());
    }

}