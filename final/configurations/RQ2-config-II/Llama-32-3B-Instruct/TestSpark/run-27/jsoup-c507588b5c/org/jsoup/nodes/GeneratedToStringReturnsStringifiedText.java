package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringReturnsStringifiedText {

    @Test
    public void toStringReturnsStringifiedText() {
        String text = "not empty";
        TextNode textNode = new TextNode(text);
        assertEquals("<text>" + text + "</text>", textNode.toString());
    }

}