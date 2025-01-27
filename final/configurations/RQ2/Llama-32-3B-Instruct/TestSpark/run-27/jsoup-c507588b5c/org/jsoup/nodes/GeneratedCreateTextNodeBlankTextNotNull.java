package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextNodeBlankTextNotNull {

    @Test
    public void createTextNodeBlankTextNotNull() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
    }

}