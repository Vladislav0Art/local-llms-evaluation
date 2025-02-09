package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void CloneTest() {
        TextNode textNode = new TextNode("Clone Test");
        assertEquals(textNode, textNode.clone());
    }

}