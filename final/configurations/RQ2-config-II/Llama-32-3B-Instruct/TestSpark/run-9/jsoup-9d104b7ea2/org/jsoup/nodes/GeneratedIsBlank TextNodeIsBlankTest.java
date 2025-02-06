package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedIsBlank TextNodeIsBlankTest {

    @Test
    public void isBlank

    TextNodeIsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        TextNode anotherTextNode = new TextNode("   ");
        assertTrue(anotherTextNode.isBlank());
    }

}