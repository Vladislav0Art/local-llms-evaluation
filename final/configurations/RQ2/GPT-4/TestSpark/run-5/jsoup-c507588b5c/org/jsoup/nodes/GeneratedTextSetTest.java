package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode node = new TextNode("Sample");
        node.text("New Sample");
        Assert.assertEquals("New Sample", node.text());
    }

}