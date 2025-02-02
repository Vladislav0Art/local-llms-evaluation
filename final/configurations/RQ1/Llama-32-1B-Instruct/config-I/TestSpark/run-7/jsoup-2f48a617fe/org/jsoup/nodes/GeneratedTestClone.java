package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment originalComment = new Comment("!original comment content");
        Comment clonedComment = originalComment.clone();
        Assert.assertNotNull(clonedComment);
        Assert.assertEquals(originalComment, clonedComment);
    }

}