package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment cloneComment = comment.clone();
        Assert.assertEquals(comment.getData(), cloneComment.getData());
    }

}