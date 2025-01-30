package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals(comment, comment.clone());
    }

}