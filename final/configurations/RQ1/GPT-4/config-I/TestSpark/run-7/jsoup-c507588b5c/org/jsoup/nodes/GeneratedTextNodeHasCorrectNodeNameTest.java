package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeHasCorrectNodeNameTest {

    @Test
    public void textNodeHasCorrectNodeNameTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertEquals("#text", tn.nodeName());
    }

}