package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextInvalidArgumentExceptionNegativeTest {

    @Test
    public void splitTextInvalidArgumentExceptionNegativeTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        textNode.splitText(-1);
    }

}