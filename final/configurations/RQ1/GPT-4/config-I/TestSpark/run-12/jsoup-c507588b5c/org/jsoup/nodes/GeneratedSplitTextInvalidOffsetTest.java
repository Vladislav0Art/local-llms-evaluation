package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextInvalidOffsetTest {

    @Test
    public void splitTextInvalidOffsetTest() {
        String sampleText = "to test splitText";
        TextNode node = new TextNode(sampleText);
        node.splitText(-1);
    }

}