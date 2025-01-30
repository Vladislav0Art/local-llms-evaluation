package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("some text");
        TextNode clone = node.clone();
        Assert.assertNotSame(node, clone);
        Assert.assertEquals(node.text(), clone.text());
    }

}