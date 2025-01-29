package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToString_ReturnsCommentString {

    @Test
    public void toString_ReturnsCommentString() {
        Comment comment = new Comment("This is a test comment");
        Assert.assertEquals("Comment", comment.toString());
    }

}