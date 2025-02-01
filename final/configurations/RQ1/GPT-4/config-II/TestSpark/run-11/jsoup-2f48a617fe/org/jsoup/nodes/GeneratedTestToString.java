package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Comment comment = new Comment("Test data");

        Assert.assertEquals(comment.toString(), comment.outerHtml());
    }

}