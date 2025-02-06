package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSetText TextNodeSetTextTest {

    @Test
    public void setText

    TextNodeSetTextTest() {
        TextNode textNode = new TextNode();
        textNode.setText("New Text");
        assertEquals("New Text", textNode.text());
    }

}