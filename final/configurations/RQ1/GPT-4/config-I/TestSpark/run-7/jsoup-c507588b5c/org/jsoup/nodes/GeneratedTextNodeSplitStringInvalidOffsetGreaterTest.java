package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeSplitStringInvalidOffsetGreaterTest {

    @Test
    public void textNodeSplitStringInvalidOffsetGreaterTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        tn.splitText(100);
    }

}