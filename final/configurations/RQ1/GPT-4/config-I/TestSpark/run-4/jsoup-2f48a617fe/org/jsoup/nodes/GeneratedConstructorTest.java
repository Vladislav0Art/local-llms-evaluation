package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("Test Data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}