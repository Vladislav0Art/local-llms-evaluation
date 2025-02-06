package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextIsEmptyTextNode {

    @Test
    public void getWholeTextIsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.getWholeText().isEmpty());
    }

}