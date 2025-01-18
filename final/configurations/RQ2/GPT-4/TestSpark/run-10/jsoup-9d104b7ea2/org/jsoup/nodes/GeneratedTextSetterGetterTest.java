package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetterGetterTest {

    @Test
    public void textSetterGetterTest() {
        String text = "newTestText";
        TextNode node = new TextNode("test");
        node.text(text);

        Assert.assertEquals(text, node.text());
    }

}