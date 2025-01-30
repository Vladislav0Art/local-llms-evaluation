package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Not empty");
        Assert.assertFalse(textNode.isBlank());
    }

}