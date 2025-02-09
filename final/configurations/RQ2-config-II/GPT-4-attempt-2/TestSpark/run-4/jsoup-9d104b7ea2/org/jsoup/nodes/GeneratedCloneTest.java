package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test Text");
        TextNode clone = node.clone();
        Assert.assertNotSame(node, clone);
        Assert.assertEquals(node.getWholeText(), clone.getWholeText());
    }

}