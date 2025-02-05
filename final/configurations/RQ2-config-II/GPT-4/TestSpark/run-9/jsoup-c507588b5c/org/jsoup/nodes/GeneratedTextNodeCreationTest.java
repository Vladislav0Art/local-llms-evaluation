package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeCreationTest {

    @Test
    public void textNodeCreationTest() {
        TextNode node = new TextNode("some text");
        Assert.assertNotNull(node);
    }

}