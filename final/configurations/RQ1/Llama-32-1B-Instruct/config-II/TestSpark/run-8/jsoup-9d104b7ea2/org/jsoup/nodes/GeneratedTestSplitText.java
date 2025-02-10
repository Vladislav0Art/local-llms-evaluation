package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.util.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("<p>Hello <span>world!</span></p>");
        String[] splitResult = textNode.splitText(10);
        assertEquals("<p>Hello<sup> world! </sup></p>", splitResult[0].toString());
        assertEquals("Hello world!", splitResult[1].text());
    }

}