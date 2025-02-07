package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestnodeNameReturnsText {

    @Test
    public void testnodeNameReturnsText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node nodeName());
    }

}