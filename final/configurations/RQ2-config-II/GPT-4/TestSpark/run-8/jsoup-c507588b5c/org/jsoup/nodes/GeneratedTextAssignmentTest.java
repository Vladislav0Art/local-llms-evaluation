package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextAssignmentTest {

    @Test
    public void textAssignmentTest() {
        TextNode textNode = new TextNode("");
        textNode.text("New Text Sample");
        Assert.assertEquals("New Text Sample", textNode.text());
    }

}