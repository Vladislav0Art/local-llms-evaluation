package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankNegativeTest {

    @Test
    public void isBlankNegativeTest() {
        TextNode textNode = new TextNode("not blank");
        assertFalse(textNode.isBlank());
    }

}