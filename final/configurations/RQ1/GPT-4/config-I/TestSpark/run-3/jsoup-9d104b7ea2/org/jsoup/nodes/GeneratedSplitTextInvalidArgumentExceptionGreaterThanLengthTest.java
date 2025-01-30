package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextInvalidArgumentExceptionGreaterThanLengthTest {

    @Test
    public void splitTextInvalidArgumentExceptionGreaterThanLengthTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        textNode.splitText(oldText.length() + 1);
    }

}