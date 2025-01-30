package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeSplitStringInvalidOffsetNegativeTest {

    @Test
    public void textNodeSplitStringInvalidOffsetNegativeTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        tn.splitText(-1);
    }

}