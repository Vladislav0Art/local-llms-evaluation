package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode node = new TextNode("Test Text");
        Assert.assertEquals("Test Text", node.text());
    }

}