package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedNodeNameTest {

    @Test
    public void NodeNameTest() {
        TextNode node = new TextNode("hello world");
        Assert.assertEquals("#text", node.nodeName());
    }

}