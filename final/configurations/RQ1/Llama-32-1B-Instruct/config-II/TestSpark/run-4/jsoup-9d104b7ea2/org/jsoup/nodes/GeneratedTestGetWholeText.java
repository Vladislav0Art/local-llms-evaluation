package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("<a>hello</a>");
        assertEquals("hello", textNode.getText());
    }

}