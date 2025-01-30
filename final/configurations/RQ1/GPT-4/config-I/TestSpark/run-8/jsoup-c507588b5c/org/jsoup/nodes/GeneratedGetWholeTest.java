package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetWholeTest {

    @Test
    public void getWholeTest() {
        TextNode node = new TextNode("some   text\n new line ");
        Assert.assertEquals("some   text\n new line ", node.getWholeText());
    }

}