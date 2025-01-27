package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedNodeName_NoValue_ReturnsNull {

    @Test
    public void nodeName_NoValue_ReturnsNull() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

}