package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String expectedString = "<a>Hello <span>World</span></a>";
        assertEquals(expectedString, textNode.getText());
    }

}