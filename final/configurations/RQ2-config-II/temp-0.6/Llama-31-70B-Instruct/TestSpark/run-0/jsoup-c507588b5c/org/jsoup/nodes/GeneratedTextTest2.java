package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTextTest2 {

    @Test
    public void textTest2() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.text("new text");
        assertEquals("new text", newTextNode.text());
    }

}