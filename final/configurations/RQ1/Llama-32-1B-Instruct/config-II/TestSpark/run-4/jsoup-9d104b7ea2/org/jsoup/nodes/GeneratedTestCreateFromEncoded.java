package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String encodedText = "<a>Hello<span> World</span></a>";
        TextNode result = TextNode.createFromEncoded(encodedText);
        assertEquals(textNode, result);
    }

}