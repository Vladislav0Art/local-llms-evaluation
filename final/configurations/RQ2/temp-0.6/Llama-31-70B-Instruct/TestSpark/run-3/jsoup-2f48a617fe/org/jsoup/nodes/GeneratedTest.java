package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("This is a comment");
    }

    @Test
    public void setDataTest() {
        String expectedData = "Hello world!";
        comment.setData(expectedData);
        Assert.assertEquals(expectedData, comment.getData());
    }

}