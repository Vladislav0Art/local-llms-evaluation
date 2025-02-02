package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextNode_EmptyString_ReturnsBlankTextNode {

    @Test
    public void createTextNode_EmptyString_ReturnsBlankTextNode() throws IOException {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}