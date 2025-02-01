package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(-1);
    }

}