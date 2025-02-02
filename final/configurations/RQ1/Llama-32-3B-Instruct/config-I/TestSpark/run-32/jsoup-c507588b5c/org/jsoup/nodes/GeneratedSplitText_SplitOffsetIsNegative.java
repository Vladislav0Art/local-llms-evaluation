package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_SplitOffsetIsNegative {

    @Test
    public void splitText_SplitOffsetIsNegative() {
        TextNode textNode = new TextNode("Hello World");
        int offset = -1;
        textNode.splitText(offset);
    }

}