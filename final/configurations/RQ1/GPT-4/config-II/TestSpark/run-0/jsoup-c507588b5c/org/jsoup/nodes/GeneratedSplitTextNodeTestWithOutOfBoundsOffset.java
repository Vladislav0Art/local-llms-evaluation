package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextNodeTestWithOutOfBoundsOffset {

    @Test
    public void splitTextNodeTestWithOutOfBoundsOffset() {
        String testString = "Test String";
        int offset = -1;
        TextNode textNode = new TextNode(testString);
        textNode.splitText(offset);
    }

}