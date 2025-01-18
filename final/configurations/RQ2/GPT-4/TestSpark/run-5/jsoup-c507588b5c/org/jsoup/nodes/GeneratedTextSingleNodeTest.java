package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSingleNodeTest {

    @Test
    public void textSingleNodeTest() {
        TextNode node = new TextNode("Sample");
        Assert.assertEquals("Sample", node.text());
    }

}