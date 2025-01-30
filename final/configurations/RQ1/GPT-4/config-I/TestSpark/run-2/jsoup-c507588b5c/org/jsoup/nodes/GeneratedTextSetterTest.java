package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode tn = new TextNode("Test");
        String newValue = "New value for text";
        tn.text(newValue);
        Assert.assertEquals(newValue, tn.getWholeText());
    }

}