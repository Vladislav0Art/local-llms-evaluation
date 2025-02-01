package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextBiggerOffsetTest {

    @Test
    public void splitTextBiggerOffsetTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(text.length() + 1);
    }

}