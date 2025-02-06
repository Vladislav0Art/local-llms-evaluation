package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedGetText TextNodeGetTextTest {

    @Test
    public void getText

    TextNodeGetTextTest() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.text());
    }

}