package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotBlankTest {

    @Test
    public void IsNotBlankTest() {
        TextNode textNode = new TextNode("Not Blank");
        assertFalse(textNode.isBlank());
    }

}