package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextGetTest {

    @Test
    public void textGetTest() {
        TextNode node = new TextNode("some   text\n new line ");
        Assert.assertEquals("some text new line", node.text());
    }

}