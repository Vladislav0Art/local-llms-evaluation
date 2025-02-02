package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        assertEquals("<p>ab c</p>", node.toString());
    }

}