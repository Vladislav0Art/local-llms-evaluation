package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeToStringTest {

    @Test
    public void textNodeToStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertNotNull(tn.toString());
    }

}