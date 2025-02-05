package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Some data");
        Comment clone = comment.clone();
        Assert.assertEquals(comment.getData(), clone.getData());
    }

}