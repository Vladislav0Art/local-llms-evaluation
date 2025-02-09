package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCommentConstructorTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("data");
        Assert.assertNotNull(comment);
    }

}