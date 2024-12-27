package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void CreateFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("hello world", false);
        Assert.assertEquals("hello world", node.text());
    }

}