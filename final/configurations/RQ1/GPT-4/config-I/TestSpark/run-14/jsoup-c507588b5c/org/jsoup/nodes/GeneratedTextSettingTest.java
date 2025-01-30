package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSettingTest {

    @Test
    public void textSettingTest() {
        TextNode textNode = new TextNode("Test Node");
        textNode.text("Another Test");
        Assert.assertEquals("Another Test", textNode.getWholeText());
    }

}