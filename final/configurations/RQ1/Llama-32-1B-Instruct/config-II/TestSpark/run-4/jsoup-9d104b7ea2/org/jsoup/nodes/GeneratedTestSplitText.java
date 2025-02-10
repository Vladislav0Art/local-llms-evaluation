package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("<p>hello <span>world</span></p>");
        TextNode result = textNode.splitText(10);
        assertEquals(new TextNode("<p>hello<span> world</span></p>"), result);
    }

}