package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("Test");
        TextNode cloned = original.clone();
        Assert.assertNotSame(original, cloned);
    }

}