package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello");
        when(node.nodeName()).thenReturn("node");

        assertEquals("node", node.nodeName());
    }

}