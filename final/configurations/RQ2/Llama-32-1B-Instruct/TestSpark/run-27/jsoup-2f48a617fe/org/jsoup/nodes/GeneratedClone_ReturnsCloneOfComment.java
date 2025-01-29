package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedClone_ReturnsCloneOfComment {

    @Test
    public void clone_ReturnsCloneOfComment() {
        Comment original = new Comment("This is a test comment");
        Comment cloned = original.clone();
        Assert.assertEquals(original, cloned);
    }

}