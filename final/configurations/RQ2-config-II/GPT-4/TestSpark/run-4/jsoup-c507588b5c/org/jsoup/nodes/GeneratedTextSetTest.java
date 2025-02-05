package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        final String testText = "Test TextNode";
        TextNode node = new TextNode("");
        node.text(testText);
        Assert.assertEquals(testText, node.text());
    }

}